package org.big.university;

public class EngineeringStudent extends Student {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8903957539217166645L;
	
	protected String elective_1;
	protected String elective_2;



	public EngineeringStudent(String name, String dateOfBirth, boolean gender, String address, String elective_1,
			String elective_2) {
		super(name, dateOfBirth, gender, address);
		this.elective_1 = elective_1;
		this.elective_2 = elective_2;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(super.toString());
		buffer.append("\nElective 1 :");
		buffer.append(elective_1);
		buffer.append("\nElective 2 :");
		buffer.append(elective_2);

		buffer.append("\nEngineering Student");
		buffer.append("\n***********************");
		return buffer.toString();

	}

	public String getElective_1() {
		return elective_1;
	}

	public void setElective_1(String elective_1) {
		this.elective_1 = elective_1;
	}

	public String getElective_2() {
		return elective_2;
	}

	public void setElective_2(String elective_2) {
		this.elective_2 = elective_2;
	}

}
