package org.big.lambda;

import java.util.ArrayList;

public class ProgramTx {

	public static void main(String[] args)
	{
		ArrayList<Transaction> arrList = new ArrayList<>();
		
		arrList.add(new Transaction(13, 23, 2, 2005, 6600f, true, true));
		arrList.add(new Transaction(2, 29, 07, 2022, 4000f, true, false));
		arrList.add( new Transaction(4, 24, 2, 2022, 30000f, true, true));
		arrList.add(new Transaction(8, 1, 2, 2022, 67000f, false, false));
		arrList.add(new Transaction(1, 29, 2, 2020, 5400f, false, true));

		System.out.println(arrList);
		System.out.println("\n***************************************************************************");

		ArrayList<Transaction> filterTransaction = new ArrayList<>();
		TransactionFilter tranFilter = originalList -> {

			for (int iTmp = 0; iTmp < arrList.size(); iTmp++)
				if (arrList.get(iTmp).txAmount > 5000)
					filterTransaction.add(arrList.get(iTmp));
			return originalList;

		};

		System.out.println(tranFilter.doFilter(filterTransaction));
		System.out.println("\n*********************End Q1******************************************************");

		ArrayList<Transaction> filterTransaction1 = new ArrayList<>();
		TransactionFilter tranFilter1 = originalList -> {

			for (int iTmp = 0; iTmp < arrList.size(); iTmp++)
				if (arrList.get(iTmp).txStatus == false)
					filterTransaction1.add(arrList.get(iTmp));
			return originalList;

		};

		System.out.println(tranFilter1.doFilter(filterTransaction1));
		System.out.println("\n************************End Q2***************************************************");

		ArrayList<Transaction> filterTransaction2 = new ArrayList<>();
		TransactionFilter tranFilter2 = originalList -> {

			for (int iTmp = 0; iTmp < arrList.size(); iTmp++)
			{
				if (arrList.get(iTmp).txArrears == true)
					arrList.get(iTmp).txAmount = ((arrList.get(iTmp).txAmount + 500f) * (18f / 100f))
							+ arrList.get(iTmp).txAmount;
				else
					arrList.get(iTmp).txAmount = arrList.get(iTmp).txAmount;
				filterTransaction2.add(arrList.get(iTmp));

			}
			return originalList;

		};
		System.out.println(tranFilter2.doFilter(filterTransaction2));
		System.out.println("\n**********************End Q3*****************************************************");
	}

}
