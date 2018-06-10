jsoup-test web scrapping

Getting GOOG quotes from https://quotes.wsj.com/GOOG/financials/annual/cash-flow

HTTPS connection works out of the box. Here is why:

In Windows Chrome shows the Certification path:

	Starfield Class 2 Certification Authority

		Starfield Services Root Certification Authority - G2

    			Amazon Root CA 1
    
        			Amazon
        
            				quote.wsj.com

Java cacerts contains the CAs from this path:

keytool -list -v -keystore cacerts:

Alias name: starfieldclass2ca [jdk]

Creation date: Aug 25, 2016

Entry type: trustedCertEntry

Owner: OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US

Alias name: starfieldservicesrootg2ca

Alias name: starfieldservicesrootg2ca [jdk]

Creation date: Aug 25, 2016

Entry type: trustedCertEntry

Owner: CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, 
C=US
