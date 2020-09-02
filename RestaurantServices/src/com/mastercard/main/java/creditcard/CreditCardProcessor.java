package com.mastercard.main.java.creditcard;

/** This class provides an utility to encrypt credit card info of customers
 * 
 * @author Akshata.Naikar
 *
 */
public class CreditCardProcessor
{
	private static final CreditCardProcessor s_instance = new CreditCardProcessor();

	/**
	 * Private constructor to prevent ad-hoc instantiation of this singleton.
	 */
	private CreditCardProcessor()
	{
		super();
	}

	/**
	 * Method returns the instance of the IDMKeystoreMgr.
	 * 
	 * @return The single instance of IDMKeyStoreMgr.
	 */
	public static CreditCardProcessor getInstance()
	{
		return s_instance;
	}

    public String encrypt(String plain, String password, String salt)
    {
    	// 1. Read public key
    	// 2. RSA encrypt
    	// 3. Send back encrypted string
    	return "";
    }
}