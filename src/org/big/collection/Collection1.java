package org.big.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args)
	{
		ArrayList<String> arrayList=new ArrayList<>();
		
		
		arrayList.add("Grape");
		arrayList.add("watermelon");
		arrayList.add("Banana");
		arrayList.add("Apple");
		
		/*
		 * 1.inde
		 */

		System.out.println("unsorted list");
		for(String data: arrayList)
			System.out.println(data);
		
		System.out.println("\nafter sorting");
		
		Collections.sort(arrayList);
		for(String data:arrayList)
			System.out.println(data);
	}

}
