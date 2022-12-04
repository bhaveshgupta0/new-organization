package organization;

import java.io.Serializable;

public abstract class Employee implements Serializable {

	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected int basicSalary;
	public Employee(String name, String address, int age, boolean gender, int basicSalary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString()
	{
		StringBuffer buffer=new StringBuffer("Name : ");
		
		buffer.append(name);
		buffer.append("\nAddress : ");
		buffer.append(address);
		buffer.append("\nAge : ");
		buffer.append(age);
		buffer.append("\nGender : ");
		buffer.append(gender);
		buffer.append("\nbBasic salary");
		buffer.append(basicSalary);
		return buffer.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadress() {
		return address;
	}
	public void setAadress(String aadress) {
		this.address = aadress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	

}
