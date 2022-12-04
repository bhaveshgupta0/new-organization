package org.big.threads;

public class DecrementThread implements Runnable {
	
	public void run()
	{
		try
		{
			while(ThreadMain.running)
			{
				double a = 5 + (Math.random() * 30);  
		        double b = 5 +  (Math.random() * 30);  
		        // Output is different every time this code is executed    
		        System.out.println(a);  
		        System.out.println(b);  
				System.out.println("***********Decrement");
				Thread.sleep(20);
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DEC existing");
	}

}
