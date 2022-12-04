package org.big.exception;

import java.io.IOException;
import java.sql.SQLException;

import Bhavesh_gupta.ConsoleInput;

public class Exception3 {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age=ConsoleInput.getInteger();
		String str="bhavesh";
		boolean flag=true;
		System.out.println("statement No 1=Main");
		try {
			System.out.println("statement No.2=try");
			str.charAt(1);
			if(age<18||age>60)
				throw new IOException("Invalid Age entered");
			System.out.println("STATEMENT nO 3=TRY");
			if(flag)
				throw new SQLException("Invalid Data Provided");
			System.out.println("statement No 4=try");
		}
		catch(IOException io)
		{
			System.out.println("statement No.5=catch-"+io);
	}
		catch(SQLException sql)
		{
			System.out.println("statement no 5 a-catch"+sql);
}
		finally {
			System.out.println("Finally $$$$$$$$$$$$$$$$$");
		}
		System.out.println("statement No 6= main");

	}

}
