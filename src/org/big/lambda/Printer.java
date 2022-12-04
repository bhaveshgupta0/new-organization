package org.big.lambda;

import java.io.Closeable;
import java.io.IOException;

public class Printer implements Closeable {
	
	public void print() throws Exception
	{
		System.out.println("Printing....");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("Realising the printers");
	}

}
