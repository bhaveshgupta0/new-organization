package org.big.recursion;

public class MaxProduct {

	public static void main(String[] args)
	{

		int[] arrNumbers = new int[] { 1, 2, 3, 4, 6, 6, 8, 99, 10 };

		maxProduct(arrNumbers);

	}

	public static void maxProduct(int[] arr)
	{

		int maximum = 0;
		int i;
		int j = 0;
		for (i = 0; i < arr.length; i++)
		{
			for (j = i+1; j < arr.length; j++)
			{

				if ((arr[i] * arr[j]) > maximum)

					maximum = (arr[i] * arr[j]);
			}
		}
		System.out.println("Maximum product of two integers of array is = "+ maximum);

	}

}
