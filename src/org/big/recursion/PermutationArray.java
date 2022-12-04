package org.big.recursion;

import java.time.LocalDate;
import java.util.Date;

public class PermutationArray {

	public static void main(String[] args)
	{
		int[] arrNumbers = new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		int[] arrNumbers1 = new int[] { 1, 9, 3, 8, 5, 6, 4, 2, 10 };

		int[] arrNumbers2 = new int[] { 1, 2, 3, 4, 6, 6, 8, 99, 10 };
		
		System.out.println(isPermutation(arrNumbers,arrNumbers1));
		
		System.out.println(isPermutation(arrNumbers1,arrNumbers2));
		
		 System.out.println(LocalDate.now());
		 
		 Date date=new Date(System.currentTimeMillis());
		 System.out.println(date);
		
		

	}

	public static boolean isPermutation(int[] arr1, int[] arr2)
	{

		int sum = 0;
		int mul=1;
		for (int i : arr1)
		{
			sum += i;
			mul*=i;
		}

		int sum1 = 0;
		int mul1=1;
		for (int i : arr2)
		{
			sum1 += i;
			mul1*=i;
		}

		if (sum == sum1&&mul==mul1)
			return true;

		return false;
	}

}
