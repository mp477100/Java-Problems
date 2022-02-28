/*
package assignment28;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Payroll {
	

		private Scanner scanner;
		private PayrollMenu menu;
		private ArrayList<Employee> employees;

		
	public Payroll(String input)
		{
			
			try
			{
				scanner = new Scanner(new FileReader(input)); 
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Input file not found!");
				System.exit(1);
			}
			
			menu = new PayrollMenu(scanner); 
			employees = new ArrayList<Employee>();
		}
			

		public Payroll()
		{
			scanner = new Scanner(System.in);
			menu = new PayrollMenu(scanner);
			employees = new ArrayList<Employee>();
		}


		public void go()
		{
			//welcome();
			menu = new PayrollMenu(scanner);
			PayrollCommand command = menu.getNextCommand();

			if (command == PayrollCommand.ADD_EMPLOYEE)
				addEmployee();
			else if (command == PayrollCommand.REMOVE_EMPLOYEE)
				removeEmployee();
			else if (command == PayrollCommand.SHOW_EMPLOYEES)
				showEmployees();
			else if (command == PayrollCommand.DO_WEEKLY_PAYROLL)
				doWeeklyPayroll();
			else if (command == PayrollCommand.QUIT)
				quit();

		}
		
		public boolean isThere(String name) 
		{
			boolean present = false; 
			
			for (int index = 0; index < employees.size(); index++)
			{
				if (name.equals(employees.get(index).getName())) 
				{	
					present = true;
				}
			}
			return present; 
		}
		
		public void welcome()
		{
			System.out.println("");
			System.out.println("ICS H22 Lab 3: The Price You Pay");
			System.out.println("Danish Khan and Adam Su");
			System.out.println("");
		}
		
		public void addEmployee()
		{
			String employeeName;
			String employeeType;
			int wage;
			
			employeeName = scanner.nextLine(); 
			
			if (isThere(employeeName))
			{
				go();
			}
			
			employeeType = scanner.nextLine();
			
				if (employeeType.compareToIgnoreCase("hourly") == 0) 
				{
					try
					{
						wage = (int)(scanner.nextDouble() * 100); 
						scanner.nextLine();
					}

					catch (InputMismatchException ime)
					{
						wage = (int)(scanner.nextDouble() * 100);
						scanner.nextLine();
						go();
					}
					
					Employee newHourlyEmployee = new hourlyEmployee(employeeName, wage);
					employees.add(newHourlyEmployee);
					System.out.println("SUCCESS! - New hourly employee, "+employeeName+", added successfully!");
					go();
				}
				else if (employeeType.compareToIgnoreCase("salaried") == 0)
				{
					try
					{
						wage = (int)(scanner.nextDouble() * 100);
						scanner.nextLine();
					}

					catch (InputMismatchException ime)
					{
						wage = (int)(scanner.nextDouble() * 100);
						scanner.nextLine();
						go();
					}
					Employee newSalariedEmployee = new salariedEmployee(employeeName, wage);
					employees.add(newSalariedEmployee);	
					System.out.println("SUCCESS! - New salaried employee, "+employeeName+", added successfully!");
					go();
				}
				else if (employeeType.compareToIgnoreCase("contract") == 0)
				{
					try
					{
						wage = (int)(scanner.nextDouble() * 100);
						scanner.nextLine();
					}

					catch (InputMismatchException ime)
					{
						wage = (int)(scanner.nextDouble() * 100);
						scanner.nextLine();
						go();
					}
					Employee newContractEmployee = new contractEmployee(employeeName, wage);
					employees.add(newContractEmployee);
					System.out.println("SUCCESS! - New contract employee, "+employeeName+", added successfully!");
					go();
				}
				go();
		}
		
		public void removeEmployee()
		{
			String name;
			boolean found = false;
			int i = 0;

			name = scanner.nextLine();
			while (i < employees.size() && (found == false))
			{
				if (name.compareToIgnoreCase(employees.get(i).getName()) == 0)
				{
					employees.remove(i);
					found = true;
				}
				i++;
			}

			if (found == false)
				System.out.println("ERROR! - The employee, "+name+", was not found in the database and could not be removed.");

			else
				System.out.println("SUCCESS! - Employee, "+name+", successfully removed from the database!");
		}
		
		private void showEmployees()
			{
				int c;
				for (c = 0; c < employees.size(); c++)
			{
			System.out.println(employees.get(c).toString());
			}
				go();
	}
		
		public void doWeeklyPayroll()
		{
			ArrayList<String> payroll = new ArrayList<String>();
			int d = 0;
			int e = 0;
			int hoursWorked;
			for (d = 0; d < employees.size(); d++)
			{
				String temp = scanner.nextLine();
				hoursWorked = scanner.nextInt();
					scanner.nextLine();
				String tempPayroll = employees.get(d).createWeeklyPaycheck(hoursWorked).toString();
				payroll.add(d, tempPayroll);
			}
			
			for (e = 0; e < payroll.size(); e++)
			{
				System.out.println (payroll.get(e));
			}
			go();
		}
		
		public void quit()
		{
			System.out.println("Thank you for using the payroll program.  Good Bye...");
			System.exit(1);
		}
				

	}
*/
