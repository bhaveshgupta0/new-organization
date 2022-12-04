package org.big.uclone;

public class MBAStudent1 extends Student1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3253141161437763534L;
	protected int yeraOfExperiance;
	protected String graduation_details;

	public MBAStudent1(String name, int day, int month, int year, boolean gender, String address, int yeraOfExperiance,
			String graduation_details) {
		super(name, day, month, year, gender, address);
		this.yeraOfExperiance = yeraOfExperiance;
		this.graduation_details = graduation_details;
	}

	
	public String toString() {

		StringBuffer buffer = new StringBuffer(super.toString());
		buffer.append("\nYear of Experience :");
		buffer.append(yeraOfExperiance);
		buffer.append("\nGraduation details:");
		buffer.append(graduation_details);
		buffer.append("\nMBA Student");
		buffer.append("\n***********************");
		return buffer.toString();

	}

	public int getYeraOfExperiance() {
		return yeraOfExperiance;
	}

	public void setYeraOfExperiance(int yeraOfExperiance) {
		this.yeraOfExperiance = yeraOfExperiance;
	}

	public String getGraduation_details() {
		return graduation_details;
	}

	public void setGraduation_details(String graduation_details) {
		this.graduation_details = graduation_details;
	}

}
