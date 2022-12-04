package org.big.collection;
import java.util.Iterator;

public class ProgramLogic {
	
	public void display(Iterator<String>iterator)
	{
		while(iterator.hasNext()) {
		
			String data=iterator.next();
			if(data.equals("watermelon")) {
			iterator.remove();
			System.out.println(data);
			}
			
			
				
			
		}
		
		
	}

}
