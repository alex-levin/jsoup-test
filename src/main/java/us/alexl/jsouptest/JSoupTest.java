package us.alexl.jsouptest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JSoupTest {
	
	/**
	 * The default behavior is to use the Certificate Authorities that come with your Java installation. 
	 * The fact that everything works out of the box means that the remote host is using a certificate 
	 * signed by a certificate authority (is not self-signed).
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String url = "https://quotes.wsj.com/GOOG/financials/annual/cash-flow";
		Document doc = Jsoup.connect(url).get();
		// <span id="ms_quote_val">1,121.30</span>
		// https://jsoup.org/cookbook/extracting-data/selector-syntax
		Element quoteElem = doc.select("span[id=quote_val]").first();
		String quote = quoteElem.text();
		System.out.println(quote);
	}
}
