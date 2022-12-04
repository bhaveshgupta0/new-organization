package organization;

public class Manager extends Employee {
	protected int hra;

	public Manager(String name, String address, int age, boolean gender, int basicSalary, int hra) {
		super(name, address, age, gender, basicSalary);
		this.hra = hra;
	}
	
	@Override
	public String toString()
	{ 
		StringBuffer buffer=new StringBuffer(super.toString());
		buffer.append("\nHRA :");
		buffer.append(hra);
		return buffer.toString();
		
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}
	
	

}

