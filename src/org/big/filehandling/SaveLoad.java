package org.big.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveLoad {

	public static void main(String[] args) {
		Data objData=new Data();
		
		objData.setName("Bhavesh");
		objData.setAge(26);
		objData.setSalary(5346257.353f);
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objOutputStream=null;
		FileInputStream fileInputStream=null;
		ObjectInputStream objInputStream=null;
		try {
			fileOutputStream=new FileOutputStream("D:\\Images\\Employee.txt");
			objOutputStream=new ObjectOutputStream(fileOutputStream);
			objOutputStream.writeObject(objData);
			System.out.println("Data Written");
			fileInputStream=new FileInputStream("D:\\Images\\Employee.txt");
			objInputStream =new ObjectInputStream(fileInputStream);
			
			Data objData1=(Data)objInputStream.readObject();
			System.out.println(objData1.getName());
			System.out.println(objData1.getAge());
			System.out.println(objData1.getSalary());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(objOutputStream!=null)
				
					objOutputStream.close();
				if(fileInputStream!=null)
					fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
