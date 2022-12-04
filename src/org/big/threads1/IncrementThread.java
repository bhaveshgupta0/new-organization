package org.big.threads1;

public class IncrementThread implements Runnable {
	
	Data objData;

	public IncrementThread(Data objData)
	{
		super();
		this.objData = objData;
	}
	
	public void run()
	{
		try
		{
			while(true) {
				synchronized(objData) {
					System.out.println(objData.value++);
					Thread.sleep(50);
				}
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*********** LEAVING INCREMENT METHOD");
	}

}
