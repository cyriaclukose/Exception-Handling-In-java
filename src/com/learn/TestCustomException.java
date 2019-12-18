package com.learn;

import com.learn.exception.CurrencyMisMatchException;

public class TestCustomException {

	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args)
	{
		Amount a=new Amount(20, "Dollar");
		
		Amount b=new Amount(44, "Rupees");
	
	    calculateSum(a,b);
	}

	/**
	 * 
	 * @param a
	 * @param b
	 */
	private static void calculateSum(Amount a, Amount b) {
		
		if(!(a.getCurrency().equalsIgnoreCase(b.getCurrency())))
		{

			throw new CurrencyMisMatchException("ERR2013455","currency mismatch");
		}else
		{
			System.out.println("sum : "+a.getAmount()+b.getAmount());
		}
		
		
	}
}
