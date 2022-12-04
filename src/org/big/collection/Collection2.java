package org.big.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args)
	{
       ArrayList<String> arrayList=new ArrayList<>();
		
		
		arrayList.add("Grape");
		arrayList.add("watermelon");
		arrayList.add("Banana");
		arrayList.add("Apple");
		
	/*	  for(int iTmp=0;iTmp<arrayList.size();iTmp++) 
			System.out.println(arrayList.get(iTmp));
		*/
		
		for(String data: arrayList)
			System.out.println(data);

	Iterator<String>iterator=arrayList.iterator();
	if(arrayList.equals("watermelon")) 
		iterator.remove();
	
	while(iterator.hasNext())
	{
		String str=iterator.next();
		System.out.println(str);
		
	}

}
}
