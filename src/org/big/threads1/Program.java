package org.big.threads1;

public class Program {

	public static void main(String[] args)
	{
		Data objData=new Data();
		Thread incThread=new Thread(new IncrementThread(objData));
		
		Thread decThread=new Thread(new DecrementThread(objData));
		incThread.start();
		decThread.start();
	}

}
