package org.big.threads;

public class Join {
	static boolean running=true;
	static IncrementThread incThread;

	public static void main(String[] args)
	throws Exception
	{
		incThread=new IncrementThread();
		incThread.setDaemon(true);
		incThread.start();
		
		DecrementJoin decThread=new DecrementJoin();
		Thread objThread=new Thread(decThread);
		objThread.start();
		

	}

}
