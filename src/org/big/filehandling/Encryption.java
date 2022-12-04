package org.big.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import Bhavesh_gupta.ConsoleInput;

public class Encryption {

	public static void main(String[] args) {

		System.out.println("Enter a key for Encryption");
		int key = ConsoleInput.getInteger();

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			File objFile = new File("D:\\Images\\BIG.txt");
			fileInputStream = new FileInputStream("D:\\Images\\BIG.txt");

			byte[] data = new byte[(int) objFile.length()];

			fileInputStream.read(data);

			int i = 0;
			for (byte b : data) {
				data[i] = (byte) (b + key);
				i++;
			}
			fileOutputStream = new FileOutputStream("D:\\Images\\Encryption.enc");

			fileOutputStream.write(data);
			String str = new String(data);
			System.out.println(str);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null)
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Encryption is Done");
		}
	}

}
