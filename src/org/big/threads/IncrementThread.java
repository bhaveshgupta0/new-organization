package org.big.threads;

public class IncrementThread extends Thread {
	public void run() {
		
			try
			{
				while(true)
				{
					System.out.println("-----Increment");
					Thread.sleep(20);
				}
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}


