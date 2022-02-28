package org.pms.models;


public class SalariedEmployee extends Employee {
	
	private double basic;
	private double hra;
	private double da;
	
	public SalariedEmployee() {
		
		netSalary =basic +hra + 0.20*da;

	}

	public SalariedEmployee(int id, String name, String address, int department, double basic, double hra, double da) {
		super(id, name, address, department);
		this.basic = basic;
		this.hra = hra;
		this.da = da;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [basic=" + basic + ", hra=" + hra + ", da=" + da + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getDepartment()=" + getDepartment()
				+ "]";
	}
	

}
