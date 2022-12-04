package org.big.recursion;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args)
	{
		int[] arrNumbers = new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		System.out.println("Enter the number that you want to search in array :");
		try (Scanner sc = new Scanner(System.in))
		{
			int x = sc.nextInt();

			searchElement(arrNumbers, x);
		}

	}

	public static void searchElement(int[] arr, int number)
	{

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == number)
			{
				System.out.println(number + " is found at the index of "+i);
				return;
			}
		}

		System.out.println(number + " is not found in array");

	}
}
