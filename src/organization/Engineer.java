package organization;

public class Engineer extends Employee {
	protected int overTime;

	public Engineer(String name, String address, int age, boolean gender, int basicSalary, int overTime) {
		super(name, address, age, gender, basicSalary);
		this.overTime = overTime;
	}
	
	@Override
	public String toString()
	{ 
		StringBuffer buffer=new StringBuffer(super.toString());
		buffer.append("\nOver Time :");
		buffer.append(overTime);
		return buffer.toString();
		
	}

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

}
