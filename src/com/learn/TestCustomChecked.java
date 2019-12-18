package com.learn;

import com.learn.exception.MisMatchException;

public class TestCustomChecked {

	/**
	 * if we throw a checked exception then we have to either handle in the same
	 * method using try catch or using throws keyword we have to pass that
	 * responsibility\ to the calling method.
	 * 
	 * if we do not handle the checked exception then we will get compile time error
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Amount a = new Amount(20, "Dollar");

		Amount b = new Amount(44, "Rupees");

		try {
			calculateSum(a, b);
		}
		
		catch (MisMatchException e)
		{
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally is always exceuted");
		}

		System.out.println("we have reached the end of the programme");

	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @throws Exception
	 */
	private static void calculateSum(Amount a, Amount b) throws Exception {

		if (!(a.getCurrency().equalsIgnoreCase(b.getCurrency()))) {

			throw new MisMatchException("12344","currency mismatch exception");
		} else {
			System.out.println("sum : " + a.getAmount() + b.getAmount());
		}

	}

}
