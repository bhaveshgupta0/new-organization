package org.big.recursion;

import java.util.Scanner;

public class DaysAboveAverage {

	public static void main(String[] args)
	{
		System.out.println("How many Days temperature you want to add");
		try (Scanner sc = new Scanner(System.in))
		{
			int numberOfDays = sc.nextInt();

			float count = 0;

			float[] arrTemp = new float[numberOfDays];

			for (int i = 0; i < arrTemp.length; i++)
			{
				System.out.println("Enter day " + (i + 1) + " High Temperature");
				arrTemp[i] = sc.nextFloat();

				count += arrTemp[i];
			}

			float avg = count / numberOfDays;

			System.out.println("Average = " + avg);

			count = 0;
			int i = 0;
			while (i < numberOfDays)
			{
				if (arrTemp[i] > avg)
					count += 1;
				i += 1;
			}

			System.out.println(count + " Days above Average");

			for (int iTmp = 0; iTmp < arrTemp.length; iTmp++)
			{
				if (arrTemp[iTmp] > avg)
				{
					System.out.print("(" + arrTemp[iTmp] + ") ");

				}

			}
		}

	}

}
