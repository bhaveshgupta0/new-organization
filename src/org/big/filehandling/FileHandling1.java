package org.big.filehandling;

import java.io.File;
import java.sql.Date;

public class FileHandling1 {

	public static void main(String[] args) {
		File objFile=new File("D:\\Images\\Addcart\\Test\\Bold\\a\\b");
		objFile.mkdirs();
		File objFile1=new File("D:\\movies");
		
		
		String[] fileNames=objFile1.list();
		for(String name: fileNames) {
			System.out.println(name);
			
		}
		
		
		
		
		//System.out.println(new Date());
	/*	File[] arrFiles=objFile1.listFiles();
		
		for(File file: arrFiles) {
			if(file.isDirectory())
				System.out.println("["+file.getName()+"]");
			else
			{
				long modifiedMillis=file.lastModified();
				Date dt=new Date(modifiedMillis);
				System.out.println(dt.toString());
				System.out.println(file.getName());
			}
		}
		*/

	}
	
	private static void basicFile() {
		
		try {
			File objFile=new File("D:\\Images\\Addcart\\Test\\Bold\\a\\b");
			objFile.delete();
			System.out.println(("file Deleted"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
