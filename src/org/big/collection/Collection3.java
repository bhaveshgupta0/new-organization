package org.big.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection3 {

	public static void main(String[] args)
	{
		ArrayList<Data>arrList=new ArrayList<>();
		Data objData=new Data("soham",19);
		arrList.add(objData);
		
		arrList.add(new Data("Bhavesh",31));
		arrList.add(new Data("ajay",24));
		arrList.add(new Data("Vijay",23));
		arrList.add(new Data("Heramb",33));
		arrList.add(new Data("Akshay",21));
		
		Collections.sort(arrList);
		
		Iterator<Data> iterator=arrList.iterator();
		while(iterator.hasNext())
		{
			Data tmpData=iterator.next();
			System.out.println(tmpData);
		}

	}

}
