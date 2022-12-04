package org.big.lambda;

import exercise.Date;

public class Transaction {
	protected int txId;
	
	protected Date txDate=new Date();
	
	protected  float txAmount;
	
	protected  boolean txStatus;
	protected boolean  txArrears;
	public Transaction(int tcId, int day,int month,int year, float txAmount, boolean txStatus, boolean txArrears)
	{
		super();
		txDate.setDate(day, month, year);
		this.txId = tcId;
		
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}
	
	public String toString()
	{
		StringBuffer buffer=new StringBuffer("\nTax Id : ");
		
		buffer.append(txId);
		buffer.append("\nTax Date : ");
		buffer.append(getTxDate().toString());
		buffer.append("\nTax Amount : ");
		buffer.append(txAmount);
		buffer.append("\nTax Status: ");
		buffer.append(txStatus);
		buffer.append("\nTax Arrears: ");
		buffer.append(txArrears);
		buffer.append("\n******************");
		return buffer.toString();
	}
	public int getTxId()
	{
		return txId;
	}
	public void setTxId(int txId)
	{
		this.txId = txId;
	}
	public Date getTxDate()
	{
		return txDate;
	}
	public void setTxDate(Date txDate)
	{
		this.txDate = txDate;
	}
	public float getTxAmount()
	{
		return txAmount;
	}
	public void setTxAmount(float txAmount)
	{
		this.txAmount = txAmount;
	}
	public boolean isTxStatus()
	{
		return txStatus;
	}
	public void setTxStatus(boolean txStatus)
	{
		this.txStatus = txStatus;
	}
	public boolean isTxArrears()
	{
		return txArrears;
	}
	public void setTxArrears(boolean txArrears)
	{
		this.txArrears = txArrears;
	}

	
	

}
