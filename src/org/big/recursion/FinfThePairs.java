package org.big.recursion;

public class FinfThePairs {

	public static void main(String[] args)
	{
		int[] arrNumbers = new int[] { 1, 2,3, 4,5, 6,8,9,10 };
		
		findPairs(arrNumbers, 9);
		  
		  
	}
	
	public static void  findPairs(int[] arr, int number)
	  {
	  System.out.println("Pairs of elements whose sum is : "+number);
	 
	  for (int i =  0; i < arr.length; i++)
	  {
	  for (int j  = i+1; j < arr.length; j++)
	  {
	  if(arr[i]+arr[j] ==number)
	  {
	  System.out.println("["+arr[i]+","+arr[j]+"] ");
	  }
	  }
	  }
	  }

}
