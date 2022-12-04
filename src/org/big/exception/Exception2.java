package org.big.exception;

import Bhavesh_gupta.ConsoleInput;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age = ConsoleInput.getInteger();
		System.out.println("statement no.1=Main");
		try {
			System.out.println("statement No 2=try");
			if (age < 18 || age > 60)
				throw new Exception("Invalid age Entered");
			System.out.println("statement No.3=try");

		} catch (Exception npe) {
			System.out.println("statement No 4- catch-" + npe);

		}
		System.out.println("statement No 5= Main");

	}

}
