package org.pms.models;

abstract public class Employee {
	
	private int id;
	private String name;
	private String address;
	private int department;	
	public Employee() {
		
		
	}
	

	public Employee(int id, String name, String address, int department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department +",netSalary="+"]";
	}
	
	
	 public abstract double getSalary() {
		 
		 
	 }

}
