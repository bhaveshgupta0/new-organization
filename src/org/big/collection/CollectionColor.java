package org.big.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionColor {

	public static void main(String[] args)
	{
		ArrayList<String>arrList=new ArrayList<>();
		
		arrList.add("Pink");
		
		arrList.add("Blue");
		arrList.add("Green");
		arrList.add("Brown");
		arrList.add("Black");
		
		Collections.sort(arrList);
		
		Iterator<String> iterator=arrList.iterator();
		while(iterator.hasNext())
		{
			String tmpData=iterator.next();
			System.out.println(tmpData);
		}

	}

}
