package org.gupta.bhavesh;

public class ArrayEx {
	int arr[] = null;
	
	public ArrayEx(int sizeOfArray) {
		
		arr = new int[sizeOfArray];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;					
		}		
	}
	
public void insert(int location, int valueToBeInserted) {
	try {
		if(arr[location] == Integer.MIN_VALUE) {
			arr[location] = valueToBeInserted;
			System.out.println("Successfully Inserted!!");
		}
		else {
			System.out.println("This location is already occupied!!");
		}
		
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Invalid Index number provided????");
		
	}
	
}

public void delete(int location, int valueToBeInserted) {
	try {
		if(arr[location] == valueToBeInserted ) {
			arr[location] = Integer.MIN_VALUE;
			System.out.println("Successfully Deleted!!");
		}
		else {
			System.out.println("This location is already Deleted!!");
		}
		
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Invalid Index number provided????");
		
	}
	
}
}
