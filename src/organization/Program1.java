package organization;

import Bhavesh_gupta.ConsoleInput;
import exercise12.LinkedList;



public class Program1 {

	public static void main(String[] args) {
		LinkedList objList=new LinkedList();
		
		for(int iTmp=0;iTmp<10;iTmp++) {
			System.out.println("Enter the numer"+(iTmp+1));
			int num1=ConsoleInput.getInteger();
			objList.add(num1);
			
		}
		Integer number=(Integer)objList.getFirst();
		while(number!=null) {
			System.out.println(number);
			number=(Integer)objList.getNext();
		}
	}
}