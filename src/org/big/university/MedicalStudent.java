package org.big.university;

public class MedicalStudent extends Student {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2430934607470960672L;
	protected String specialization;

	

	public MedicalStudent(String name, String dateOfBirth, boolean gender, String address,
			String specialization) {
		super(name,  dateOfBirth, gender, address);
		this.specialization = specialization;
	}

	@Override
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
