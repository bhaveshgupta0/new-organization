package org.big.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) {
		//writeToFile();
		
		FileInputStream fileInputStream=null;
		
			try {
				File objFile= new File("D:\\Images\\First.txt");
				
				fileInputStream=new FileInputStream("D:\\Images\\First.txt");
				byte[] data=new byte[(int)objFile.length()];
				
				fileInputStream.read(data);
				String str=new String(data);
				System.out.println(str);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally
			{
				if(fileInputStream!=null)
					try {
						writeToFile();	
						fileInputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							
			}
		

	}
	
	
	private static void writeToFile() {
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream=new FileOutputStream("D:\\Images\\First.txt",true);
			String data="hi Bhavesh......:)";
			fileOutputStream.write(data.getBytes());
			System.out.println("file written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			if(fileOutputStream!=null)
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
