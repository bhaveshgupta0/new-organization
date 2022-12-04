package org.big.recursion;

public class MissingNumber {

	public static void main(String[] args)
	{

		int[] arrNumbers = new int[] { 1, 2,3, 4,5, 6,8,9,10 };
		
		int totalNumber = arrNumbers.length+1;
		
		int expectedSum = (totalNumber * (totalNumber + 1)) / 2;
		
		int sum = 0;
		for (int i :arrNumbers)
		{
			sum += i;
		}
		System.out.println("Missing Number from array= "+(expectedSum - sum));
		

	}

}
