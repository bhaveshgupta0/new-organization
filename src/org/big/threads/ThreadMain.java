package org.big.threads;

public class ThreadMain {

	static boolean running;

	public static void main(String[] args) throws InterruptedException
	{
		IncrementThread incThread=new IncrementThread();
		incThread.setDaemon(false);
		incThread.start();
		DecrementThread decThread=new DecrementThread();
		
		Thread objThread=new Thread(decThread);
		objThread.start();
		
		for(int iTmp=0;iTmp<100;iTmp++) {
			System.out.println("Main exiting................. ");
			Thread.sleep(50);
		}
		
		ThreadMain.running=false;
	}

}
