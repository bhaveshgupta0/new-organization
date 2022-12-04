package org.big.lambda;

import java.util.function.Predicate;

public class ProgramPredicate {

	

	public static void main(String[] args)
	{
		// predefined Functional Interfaces
		
	/*	1.Predicate -> take 1 parameter and return a boolean (test condition)
	    2.Function -> take 1 parameter and return same type of parameter
		3.Consumer-> take 1 parameter and returns nothing (void)
		4.Supplier -> zero arguments but returns a value 				
						*/

		Predicate<String> lenthString=str-> str.length()>5;
		
		System.out.println(lenthString.test("Bhavesh"));
		
		Predicate<String> splCharacter=str->
		{
			char[] splChar= {'@','#','$'};
			for(int iTmp=0;iTmp<splChar.length;iTmp++)
				if(str.indexOf(splChar[iTmp])!=-1)
					return true;
			return false;
		};
		
		String data="Pankaj$";
		
		boolean status=lenthString.and(splCharacter).test(data);
		
		if(status)
			System.out.println("Entered string is correct");
	}

}
