package org.big.recursion;

public class ReverseString {

	public static void main(String[] args)
	{
		reversString("Data");

		reversString("structure");

		reversString("Algorithm");

	}

	public static String reversString(String str)
	{

		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length() - 1));
			reversString(str.substring(0, str.length() - 1));

		}
		return str;

	}

}
