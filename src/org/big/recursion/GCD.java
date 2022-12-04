package org.big.recursion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args)
	{
		System.out.println("Enter the no. a");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Enter the no. b");
        int b = sc.nextInt();
 
        System.out.println(gcd(a, b));

	}
	public  static int  gcd(int a, int b)
    {
    	 if (a == 0)
    	       return b;
    	    if (b == 0)
    	       return a;
    	   
    	    
    	    if (a == b)
    	        return a;
    	   
    	   
    	    if (a > b)
    	        return gcd(a-b, b);
    	    return gcd(a, b-a);

}
}
