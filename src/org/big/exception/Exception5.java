package org.big.exception;



public class Exception5 {

	public static void main(String[] args) {
		try {
			Date objDate=new Date(6,10,2022);
			Date objDate2=new Date(23,2,2022);
			objDate.setDate(1,5,2222);
			objDate2.setDate(28, 4,2022 );
		}
		catch (DateException e) {
			e.printStackTrace();
		}
	}

}
