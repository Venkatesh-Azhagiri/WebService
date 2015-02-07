package com.cxf.contractFirst.endpoint;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;




@javax.jws.WebService(
        serviceName = "CurrencyConvertor",
        portName = "CurrencyConvertorSoap",
        targetNamespace = "http://www.webservicex.net",
        endpointInterface = "net.webservicex.CurrencyConvertorSoap")
public class CxfContractFirst implements CurrencyConvertorSoap{

	public double conversionRate(Currency fromCurrency, Currency toCurrency) {
		System.out.println("Inputs ");
		System.out.println("From Currency "+fromCurrency);
		System.out.println("To Currency "+toCurrency);
		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
        CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();
        double currencyConversion = currencyConvertorSoap.conversionRate(fromCurrency, toCurrency);
        System.out.println("currencyConversion  "+currencyConversion);
		return currencyConversion;
	}

}
