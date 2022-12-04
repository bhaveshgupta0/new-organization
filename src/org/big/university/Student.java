package org.big.university;

import java.io.Serializable;

import exercise.Date;

public abstract class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9128486443292111092L;
	protected String name;
	protected String dateOfBirth;
	
	protected boolean gender;
	
	protected String address;

	
	public Student(String name, String dateOfBirth, boolean gender, String address) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString()
	{
		StringBuffer buffer=new StringBuffer("Name : ");
		
		buffer.append(name);
		buffer.append("\nDate of Birth : ");
		buffer.append(dateOfBirth);
		buffer.append("\nGender : ");
		buffer.append(gender);
		buffer.append("\nAddress");
		buffer.append(address);
		return buffer.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
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
