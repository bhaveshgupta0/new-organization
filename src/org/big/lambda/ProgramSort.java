package org.big.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import exercise.Date;

public class ProgramSort {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
//1. Lambda expression to sort a string array in alphabetical order.
			
		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("Pink");

		arrList.add("Blue");
		arrList.add("Green");
		arrList.add("Brown");
		arrList.add("Black");

		System.out.println("\nbefore sorting");
		System.out.println(arrList);

		Function<List<String>, List<String>> sort = inputList -> {
			Collections.sort(inputList);
			return inputList;
		};
		System.out.println(sort.apply(arrList));

		System.out.println("\n*********END Q1*********");
		
		//2. Lambda expression to find the largest number in an integer array.

		ArrayList<Integer> arrList1 = new ArrayList<>();

		arrList1.add(65);

		arrList1.add(95);
		arrList1.add(67);
		arrList1.add(88);
		arrList1.add(99);

		Consumer<List<Integer>> largest = inputList -> {
			int max = inputList.get(0);
			for (int iTmp = 0; iTmp < inputList.size(); iTmp++)
			{
				if (inputList.get(iTmp) > max)
				{
					max = inputList.get(iTmp);
				}

			}
			System.out.println(inputList);
			System.out.println("\nLargest No.= " + max);

		};

		largest.accept(arrList1);
		System.out.println("\n*********END Q2*********");
		
		//3. Lambda expression to find the smallest number in an integer array.

		Consumer<List<Integer>> smallest = inputList -> {
			int min = inputList.get(0);
			for (int iTmp = 0; iTmp < inputList.size(); iTmp++)
			{
				if (inputList.get(iTmp) < min)
				{
					min = inputList.get(iTmp);
				}

			}
			System.out.println(inputList);
			System.out.println("\nSmallest No.= " + min);

		};

		smallest.accept(arrList1);
		System.out.println("\n*********END Q3*********");
		
		//4. Lambda expression to generate a 3 digit random number

		Supplier<String[]> randomNo = () -> {
			try
			{
				while (true)
				{
					int pos = (int) (Math.random() * 9);
					String otp = String.valueOf(pos);
					for (int iTmp = 0; iTmp < 2; iTmp++)
						otp += (int) (Math.random() * 9);
					System.out.println(otp);
					Thread.sleep(2000);

					break;

				}
			} catch (InterruptedException e)
			{ // TODO Auto-generated catch block
				e.printStackTrace();
			}
			return args;

		};

		 randomNo.get();
		

		System.out.println("\n*********END Q4*********");
		
		
//5. Lambda expression that takes an integer array and returns the reverse integer array
		
		Consumer<List<Integer>> reverse = inputList -> {
			System.out.println("Original Array:");
			for (int iTmp = 0; iTmp < inputList.size(); iTmp++)
				System.out.print(inputList.get(iTmp) + "  ");

			System.out.println();

			System.out.println("reverse order Array:");
			for (int iTmp = inputList.size() - 1; iTmp >= 0; iTmp--)
				System.out.print(inputList.get(iTmp) + "  ");

		};

		reverse.accept(arrList1);

		System.out.println("\n*********END Q5*********");
		
		//6. Lambda expression to print the current date

		Supplier<Date> date = () -> {
			Date newDate = new Date();
			newDate.setDate(25, 10, 2022);

			return newDate;

		};

		System.out.println("Date : " + date.get());

		System.out.println("\n*********END Q6*********");
		
		//7. Lambda expression to evaluate if a number entered is a Prime number

		Predicate<Integer> isPrime = number -> {
			for (int iTmp = 2; iTmp <= number / 2; iTmp++)
			{
				if (number % iTmp == 0)
				{
					return false;
				}
			}
			return true;
		};

		System.out.println("Enter the No.");
		
			int num1 = sc.nextInt();
			boolean status = isPrime.test(num1);

			if (status)
				System.out.println("Entered No. is prime");
			


		

		System.out.println("\n*********END Q7*********");
		
//8. Lambda expression to accept 2 strings and return the concatenated value of the same
		
		BiFunction<String, String, String> concatenator = (str1, str2) -> str1 + str2;

		System.out.println(concatenator.apply("Bhavesh", " Gupta"));
		
		System.out.println("\n\n*********END Q8*********");
		
		
		BiFunction<String, String,Integer> difference = (str1, str2) -> str1.length() - str2.length();

		System.out.println(difference.apply("Bharthhvesh", "Gupta"));
		System.out.println("\n\n*********END Q9*********");
		
		
		BiFunction<Integer, Integer,Integer> difference1 = (Integer num3,  Integer num2) -> num3 -  num2;
		System.out.println("Enter the no.1");
		int num3=sc.nextInt();
		System.out.println("Enter the number 2");
		int num2=sc.nextInt();
		
		System.out.println(difference1.apply(num3,num2));
		
		
		
	}
	}
}


