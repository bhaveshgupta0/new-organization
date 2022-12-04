package org.big.uclone;

public class MedicalStudent1 extends Student1 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4351693269708150831L;
	protected String specialization;

	public MedicalStudent1(String name, int day, int month, int year, boolean gender, String address,
			String specialization) {
		super(name, day, month, year, gender, address);
		this.specialization = specialization;
	}

	
	public String toString() {

		StringBuffer buffer = new StringBuffer(super.toString());
		buffer.append("\nSpecialization :");
		buffer.append(specialization);

		buffer.append("\nMedical Student");
		buffer.append("\n***********************");
		return buffer.toString();
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
