package org.pms.models;

public class CommisionEmployee extends Employee{

	private double commissionRate;
	private double grossSales;
	

	public CommisionEmployee() {
		

		
		
	}
	public CommisionEmployee(int id, String name, String address, int department, double commissionRate,
			double grossSales) {
		super(id, name, address, department);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public void calculate() {

	}
	@Override
	public String toString() {
		return "CommisionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getDepartment()="
				+ getDepartment() + "]";
	}
	
	
}
