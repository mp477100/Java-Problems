package org.pms.models;

import java.util.Scanner;

public class Tester1 {
	
	public static void main(String[] args, int department) {
		
		Scanner sc = new Scanner(System.in);
		Employee employees[] = new Employee[5];
		int index = 0;
		double netSalary;
	
		  
		while(true)
		{
			System.out.println("Enter your Choice:");
			System.out.println("1. Add Salaried employees");
			System.out.println("2. Add Commission employees");
			System.out.println("3. Add Part Worker employees");
			System.out.println("4. Display all employees");
			System.out.println("5. Display an employee by using id");
			System.out.println("6. Display Salary of Employees");
			System.out.println("7. Display Employees using Department id");
			System.out.println("0. Exit");
			
			int choice  = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter id, name, address, deptid, basic, hra & da");
				SalariedEmployee se = new SalariedEmployee(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				if(index < employees.length)
				{
					employees[index++] = se;
					System.out.println("Salaried employee added successfully");
				}
				else
				{
					System.out.println("not enough space to add new employee");
				}					
				break;
				
			case 2:
				System.out.println("Enter id, name, address, deptid, commission rate & gross sale");
				CommisionEmployee ce = new CommisionEmployee(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
				
				if(index < employees.length)
				{
					employees[index++] = ce;
					System.out.println("Commission employee added successfully");
				}
				else
				{
					System.out.println("not enough space to add new employee");
				}	
				break;

			case 3:
				System.out.println("Enter id, name, address, deptid, rate per part & no of parts");
				PartWorkEmployee pe = new PartWorkEmployee(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
				
				if(index < employees.length)
				{
					employees[index++] = pe;
					System.out.println("PartWorker employee added successfully");
				}
				else
				{
					System.out.println("not enough space to add new employee");
				}	
				break;

			case 4:
				System.out.println("Displaying all employees");
				for(Employee temp : employees)
				{
					if(temp != null)
					{
						System.out.println(temp);
					}
				}
				break;

			case 5:
				System.out.println("Enter id");
				int id = sc.nextInt();
				
				boolean flag = false;
				
				for(Employee temp : employees)
				{
					if(temp != null)
					{
						if(temp.getId() == id)
						{
							System.out.println(temp);
							flag= true;
				break;
						}
					}
				}
				if(!flag)
				{
					System.out.println("Employee not found!");
				}
				
			/*
			case 6:
				System.out.println("Enter the Employee id to display Salary");
				id= sc.nextInt();
				SalariedEmployee salariedEmployee = new SalariedEmployee();
				double netSalary = salariedEmployee.
				System.out.println("Net Salary ="+netSalary);
				break;
			
			case 7:
				System.out.println("Display employee using dept id");
				department = sc.nextInt();
				boolean flag1 = false;

				for(int i=0; i) {
				Employee es = es.nextInt();
				if(id == es.getDepartment())
				{
					System.out.println("The details of the employee with id " +id +" is: ");
					System.out.print(es.getId() +" " +es.getName()+" " +es.getAddress());
					flag = true;
					break;	
						
				}
}
				
				break;
	*/
			case 0:
				System.out.println("Thank you!");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	

	
}
}
