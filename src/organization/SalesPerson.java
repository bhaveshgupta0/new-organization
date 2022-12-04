package organization;

public class SalesPerson extends Employee {
	protected int commission;

	public SalesPerson(String name, String address, int age, boolean gender, int basicSalary, int commission) {
		super(name, address, age, gender, basicSalary);
		this.commission = commission;
	}
	
	@Override
	public String toString()
	{ 
		StringBuffer buffer=new StringBuffer(super.toString());
		buffer.append("\nCommission :");
		buffer.append(commission);
		return buffer.toString();
		
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	

}
