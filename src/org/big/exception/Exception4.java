package org.big.exception;

public class Exception4 {

	public static void main(String[] args) {
		try {
			sendSMS("989863", "bhavesh hi");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void sendSMS(String mobile, String text) throws Exception {
		boolean connection = false;
		boolean sms = false;
		System.out.println("connecting to Mobile Tower");

		connection = false;
		if (connection == true)
			System.out.println("connection to Mobile Tower");

		else
			throw new Exception("Failed connection");
		System.out.println("Sending SMS");
		sms = true;
		if (sms == true)
			System.out.println("sms sent");
		else
			throw new Exception("Failed sending sms");

	}
}
