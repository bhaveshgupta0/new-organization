package org.big.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection5 {

	public static void main(String[] args)
	{
		Set<String> set=new TreeSet<>();
		boolean flag;
		flag=set.add("Bhavesh");
		System.out.println(flag);
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
