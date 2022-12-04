package org.big.exception;

public class Date {
	private int day;
	private int month;
	private int year;
	private int noOfDays[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date() {
		day=month=1;
		year=2022;
	}
	public Date(int tmpDay,int tmpMonth,int tmpYear)
	throws DateException
	{
		setDate(tmpDay,tmpMonth,tmpYear);
	}
	public boolean isLeapYear()
	{
		return year%4==0;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	public void setDate(int tmpDay, int tmpMonth, int tmpYear)
	throws DateException
	{
		if(tmpYear<1900||tmpYear>3000)
			throw new DateException("invalid year");
		else
			year=tmpYear;
		if(tmpMonth<1 || tmpMonth>12)
			throw new DateException("invalid Month");
		else
			month=tmpMonth;
		if(isLeapYear())
			noOfDays[2]=29;
			else
				noOfDays[2]=28;
		if(tmpDay>noOfDays[month]||tmpDay<1)
			throw new DateException("Invalid day");
		else
			day=tmpDay;
	}
public void addDays(int noOfDays)
{
}
}

