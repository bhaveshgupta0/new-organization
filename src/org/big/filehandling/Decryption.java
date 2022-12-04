package org.big.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import Bhavesh_gupta.ConsoleInput;

public class Decryption {

	public static void main(String[] args) {
		System.out.println("Enter a key for Decryption");
		int key=ConsoleInput.getInteger();
		
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
		
		try {
			File objFile= new File("D:\\Images\\Encryption.enc");
			fileInputStream=new FileInputStream("D:\\Images\\Encryption.enc");
			
			byte[] data=new byte[(int)objFile.length()];
			
			fileInputStream.read(data);
			
			int i=0;
			for(byte b:data) {
				data[i]=(byte) (b-key);
				i++;
			}
            fileOutputStream=new FileOutputStream("D:\\Images\\Decryption.txt");
			
			fileOutputStream.write(data);
			String str=new String(data);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fileOutputStream !=null)
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fileInputStream !=null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println("Decryption is Done");
		}
		
				}
		
	}




	


