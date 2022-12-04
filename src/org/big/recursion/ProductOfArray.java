package org.big.recursion;

public class ProductOfArray {

	public static void main(String[] args)
	{
		int[] arr= {2,6,9,56,7};
		
		productOfArray(arr);

	}
	
	public static void productOfArray(int[] arr)
	{
		 int product=1;
		for (int i : arr)
	     product *= i;
		System.out.println("The product is " + product);
	}

}
