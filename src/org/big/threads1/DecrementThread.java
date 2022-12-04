package org.big.threads1;

public class DecrementThread implements Runnable {
	
	Data objData;
	
	public DecrementThread(Data objData) {
		super();
		this.objData=objData;
	}
	
	public void run() {
		try
		{
			while(true) {
				synchronized(objData)
				{
					System.out.println(objData.value--);
					
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
