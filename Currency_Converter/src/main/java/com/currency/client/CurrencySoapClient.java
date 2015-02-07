package com.currency.client;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrencySoapClient {
	private static final Logger           LOGGER      = LoggerFactory.getLogger(CurrencySoapClient.class);
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEEE, MMMM d yyyy");
 
	public static void main(String[] args) {
		 try {
	            LOGGER.debug("Creating weather service instance (Note: Weather = Service subclass)...");
	            long start = new Date().getTime();
	            // Get a reference to the SOAP service interface.
	            CurrencyConvertor currencyConvertor = new CurrencyConvertor();
	            CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();
	            long end = new Date().getTime();
	            LOGGER.debug("...Done! CurrencyService instance: {}", currencyConvertor);
	            LOGGER.debug("Time required to initialize weather service interface: {} seconds", (end - start) / 1000f);
	            
	         // Send a SOAP currency request for currency code .
	            LOGGER.debug("currencyConvertorSoap instance: {}", currencyConvertorSoap);
	            start = new Date().getTime();
	            double currencyConversion = currencyConvertorSoap.conversionRate(Currency.USD, Currency.INR);
	            LOGGER.debug("Currency conversion value obtained is: {}", currencyConversion);
	            System.out.println("Currency conversion value obtained is: {}"+currencyConversion);
	            end = new Date().getTime();
		 }catch (Exception e) {
	            LOGGER.error("An exception occurred, exiting", e);
	        }
	 
	}

}
