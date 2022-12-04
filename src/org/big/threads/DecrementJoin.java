package org.big.threads;

public class DecrementJoin implements Runnable {
	
	public void run()
	{
		try
		{
			System.out.println("Decrement Thread Started");
			Join.incThread.join(4000); //milli secs 1000=>1 sec
			while(Join.running)
			{
				System.out.println("###########Decrement");
				Thread.sleep(20);
				
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Dec exiting");
	}

}
