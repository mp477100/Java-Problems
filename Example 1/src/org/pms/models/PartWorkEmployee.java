package org.pms.models;


public class PartWorkEmployee extends Employee {
	
	private double rateperpart;
	private double noOfparts;
	
	public PartWorkEmployee() {
		
		
	}

	public PartWorkEmployee(int id, String name, String address, int department, double rateperpart, double noOfparts) {
		super(id, name, address, department);
		this.rateperpart = rateperpart;
		this.noOfparts = noOfparts;
	}

	public double getRateperpart() {
		return rateperpart;
	}

	public void setRateperpart(double rateperpart) {
		this.rateperpart = rateperpart;
	}

	public double getNoOfparts() {
		return noOfparts;
	}

	public void setNoOfparts(double noOfparts) {
		this.noOfparts = noOfparts;
	}

	@Override
	public String toString() {
		return "PartWorkEmployee [rateperpart=" + rateperpart + ", noOfparts=" + noOfparts + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getDepartment()=" + getDepartment()
				+ "]";
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	 

	
