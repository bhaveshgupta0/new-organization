package org.big.recursion;

public class IsUnique {

	public static void main(String[] args)
	{

		int[] arrNumbers = new int[] { 1, 2, 3, 4, 6, 8, 99, 10 };

		System.out.println(isUnique(arrNumbers));

	}

	public static boolean isUnique(int[] arr)
	{

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{

				if ((arr[i]==arr[j]))
				return false;
					
			}
		}
		
		return true ;

	}
}
