package org.big.exception;

public class Exception1 {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println("statement No 1 = Main");
		try {
			System.out.println("Statement No 2= Try");
			str.charAt(1);
			System.out.println("Statement No 3= try");
		}
		
		catch(NullPointerException npe)
		{
			System.out.println("statement No.4-catch-"+npe);
			
		}
		System.out.println("statement No. 5=Main");

	}

}

