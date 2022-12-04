package org.big.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import Bhavesh_gupta.ConsoleInput;

public class Decryption1 {

	public static void main(String[] args) {
		System.out.print("Enter key for Decryption : ");
        int key = ConsoleInput.getInteger();
        
        try {
			FileInputStream fis = new FileInputStream("D:\\Images\\First.txt");
			byte data[] = new byte[fis.available()];
			fis.read(data);
			
			int i=0;
			for (byte b : data) {
	            data[i] = (byte)(b ^ key);
	            i++;
	        }
			
			FileOutputStream fos = new FileOutputStream("D:\\Images\\First.txt");
			fos.write(data);
			fos.close();
            fis.close();
            System.out.println("Decryption Done...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
