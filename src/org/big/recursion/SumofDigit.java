package org.big.recursion;

public class SumofDigit {

	public static void main(String[] args)
	{
		int num = 9833;
	    int result =  sumofDigitl(num);
	    System.out.println("SumofDigit= "+result);

	}
	public static int sumofDigitl(int n)
	{
		if (n == 0)
		    return 0;
		    return (n % 10 + sumofDigitl(n / 10));
	}

}
