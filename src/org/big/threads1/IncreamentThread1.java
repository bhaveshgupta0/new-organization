package org.big.threads1;

public class IncreamentThread1 implements Runnable {
	
	Data objData;

	
	public IncreamentThread1(Data objData)
	{
		super();
		this.objData = objData;
	}


	public void run()
	{
		int count=0;;
		
		try
		{
			while(true) {
				synchronized(objData) {
					
					if(count>=10)
					{
						count=0;
						objData.notifyAll();
					}
					
					System.out.println(objData.value++);
					Thread.sleep(50);
				}
				count++;
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*********** LEAVING INCREMENT METHOD");
	}

}
 
