package org.big.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionColor2 {

	public static void main(String[] args)
	{
		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("Pink");

		arrList.add("Blue");
		arrList.add("Green");
		arrList.add("Brown");
		arrList.add("Black");

		System.out.println(arrList);
		// 2
		arrList.add(0, "Red");
		System.out.println(arrList);
		System.out.println("end 2");
		// 3
		System.out.println(arrList.get(0));
		System.out.println("end 3");
		// 4
		arrList.set(2, "Magenta");

		System.out.println(arrList);
		System.out.println("end 4");
		// 5
		arrList.remove(2);
		System.out.println(arrList);
		System.out.println("end 5");
		// 6
		if (arrList.contains("Red"))
			System.out.println("Element is present");
		System.out.println("end 6");
		// 7
		System.out.println("Before sorting");
		for (String data : arrList)
			System.out.println(data);
		System.out.println("after sorting");
		Collections.sort(arrList);
		System.out.println(arrList);
		System.out.println("end 7");
		// 8
		@SuppressWarnings("unchecked")
		ArrayList<String> arrList1 = (ArrayList<String>) arrList.clone();

		System.out.println(arrList1);
		System.out.println("end 8");
		// 9
		Collections.shuffle(arrList);
		System.out.println(arrList);
		System.out.println("\nend 9");
		// 10

		Collections.reverse(arrList);
		System.out.println(arrList);
		System.out.println("\nend 10");
	}

}
