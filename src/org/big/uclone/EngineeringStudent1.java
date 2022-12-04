package org.big.uclone;

public class EngineeringStudent1 extends Student1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8852679424785740715L;
	protected String elective_1;
	protected String elective_2;

	public EngineeringStudent1(String name, int day, int month, int year, boolean gender, String address,
			String elective_1, String elective_2)
	{
		super(name, day, month, year, gender, address);
		this.elective_1 = elective_1;
		this.elective_2 = elective_2;
	}

	public String toString()
	{

		StringBuffer buffer = new StringBuffer(super.toString());
		buffer.append("\nElective 1 :");
		buffer.append(elective_1);
		buffer.append("\nElective 2 :");
		buffer.append(elective_2);

		buffer.append("\nEngineering Student");
		buffer.append("\n***********************");
		return buffer.toString();

	}

	public String getElective_1()
	{
		return elective_1;
	}

	public void setElective_1(String elective_1)
	{
		this.elective_1 = elective_1;
	}

	public String getElective_2()
	{
		return elective_2;
	}

	public void setElective_2(String elective_2)
	{
		this.elective_2 = elective_2;
	}

}
