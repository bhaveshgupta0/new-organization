package org.big.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection4 {

	public static void main(String[] args)
	{
		Set<String> set=new HashSet<>();
		set.add("Bhavesh");
		set.add("Ajaay");
		set.add("Heramb");
		set.add("Bhavesh");
		set.add("Shivam");
		
		Iterator<String> iterator=set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
