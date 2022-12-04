package org.big.uclone;

import java.io.Serializable;

import exercise.Date;

public abstract class Student1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3524949028608890614L;
	
	protected String name;
	protected Date dateOfBirth=new Date();
    protected boolean gender;
	
	protected String address;
	
	public Student1(String name,int day,int month,int year, boolean gender, String address) {
		super();
		dateOfBirth.setDate(day, month, year);
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	
	public String toString()
	{
		StringBuffer buffer=new StringBuffer("Name : ");
		
		buffer.append(name);
		buffer.append("\nDate of Birth : ");
		buffer.append(getDateOfBirth() );
		buffer.append("\nGender : ");
		buffer.append(gender);
		buffer.append("\nAddress: ");
		buffer.append(address);
		return buffer.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
