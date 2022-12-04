package org.big.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FirstChar {

	public static void main(String[] args)
	{

		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("i love my india");

		Consumer<List<String>> capitalizeFc = inputList -> {

			String upper_case_line = "";

			Iterator<String> obj_Bhavesh = arrList.iterator();

			while (obj_Bhavesh.hasNext())
			{
				String word = obj_Bhavesh.next();
				upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
			}
			System.out.println(upper_case_line.trim());
		};

		capitalizeFc.accept(arrList);

	}
}
