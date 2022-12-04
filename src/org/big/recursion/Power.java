package org.big.recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args)
	{
		System.out.println("Enter the no.");
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		System.out.println("Enter the Power");
        int power = sc.nextInt();
 
        System.out.println(power1(number, power));

	}
	public  static int power1(int number, int  power)
    {
        if (power == 0)
            return 1;
        else
            return number * power1(number, power - 1);
    }
	}


