package org.big.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import Bhavesh_gupta.ConsoleInput;

public class FileHandling3Main {

	public static void main(String[] args) {
		//writeToFile();
		
		//readFromFile();
		
		//writeUsingDis();
		
		//readUsingDis();
		
		Scanner scanner=null;
		
		try {
			scanner =new Scanner(System.in);
			String data=scanner.next();
			
			int age=scanner.nextInt();
			System.out.println(data);

			System.out.println(age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void readUsingDis() {
		DataInputStream dataInputStream=null;
		FileInputStream fileInputStream=null;
		
		try {
			fileInputStream=new FileInputStream("D:\\Big\\test1.txt");
			
			dataInputStream=new DataInputStream(fileInputStream);
			try {
				while(true)
				{
					String name=dataInputStream.readUTF();
					int age=dataInputStream.readInt();
					float salary=dataInputStream.readFloat();
					
					System.out.println(name);
					System.out.println(age);
					System.out.println(salary);
				}
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(dataInputStream!=null)
					dataInputStream.close();
				if(fileInputStream!=null)
					fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void writeUsingDIS() {
		DataOutputStream dataOutputStream=null;
		FileOutputStream fileOutputStream=null;
		
		try {
			fileOutputStream=new FileOutputStream("D:\\Big\\test1.txt");
			
			dataOutputStream=new DataOutputStream(fileOutputStream);
			
			int choice=1;
			while(choice!=5)
			{
				System.out.println("enter choice, 5 to exit");
				choice=ConsoleInput.getInteger();
				System.out.println("Enter the name");
				String name=ConsoleInput.getstring();
				System.out.println("Enter the age");
				int age=ConsoleInput.getInteger();
				System.out.println("Enter the salary");
				float salary=ConsoleInput.getFloat();
				dataOutputStream.writeUTF(name);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
