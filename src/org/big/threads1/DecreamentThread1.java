package org.big.threads1;

public class DecreamentThread1 implements Runnable {
	
	Data objData;
	
	
	public DecreamentThread1(Data objData)
	{
		super();
		this.objData = objData;
	}


	public void run() {
		try
		{
			while(true) {
				synchronized(objData)
				{
					objData.wait();
					System.out.println("Dec fired......"+objData.value--);
					
					
					Thread.sleep(50);
				}
				
			}
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 
