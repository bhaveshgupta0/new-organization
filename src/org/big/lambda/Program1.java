package org.big.lambda;

public class Program1 {

	public static void main(String[] args)
	{
		Calculator<Integer> addCalculator = (Integer num1, Integer num2) ->

		{
			return num1 + num2;
		};
		int result = addCalculator.compute(98, 100);
		System.out.println(result);

		Calculator<Double> subCalculator = (num1, num2) -> num1 - num2;
		double subResult = subCalculator.compute(78.76, 98.99);
		System.out.println(subResult);
	}

}
