package org.assignment;
import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		
		int calls;
		
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("Choose Your Plan details (planA,planB,planC):");
		char Mobilebill = scan.next().charAt(0);
		
		
		System.out.println("Enter the number of calls made by customer:");
		calls = scan.nextInt();
		
		scan.close();
		
		switch(Mobilebill) {
		
		case 'A':
			
			double total = 0;
			if(calls<100)
			{
			total = 100;
			}
			else if(calls >100 && calls <200)
			{
			total = 100 + (calls-100)*0.75;
			}
			else if(calls >200 && calls <300)
			{
			total = 100 + 75 + (calls-200)*1;
			}
			else
			{
			total = 100 + 75 + 100 + (calls-300)*1.25;
			}
			
			System.out.println("Total bill is"+total);
		
		
		case 'B':
			
			double total1 = 0;
			if(calls<150)
			{
			total1 = 100;
			}
			else if(calls >100 && calls <200)
			{
			total1 = 100 + (calls-100)*0.50;
			}
			else if(calls >200 && calls <300)
			{
			total1 = 100 + 75 + (calls-200)*0.75;
			}
			else
			{
			total1 = 100 + 75 + 100 + (calls-300)*1;
			}
			System.out.println("Total bill is"+total1);
			
		case 'C':
			double total2 = 0;
			if(calls<200)
			{
			total2 = 100;
			}
			else if(calls >100 && calls <200)
			{
			total2 = 100 + (calls-100)*0.25;
			}
			else if(calls >200 && calls <300)
			{
			total2 = 100 + 75 + (calls-200)*0.50;
			}
			else
			{
			total2 = 100 + 75 + 100 + (calls-300)*0.75;
			}
			System.out.println("Total bill is"+total2);
			
		default:
			
			System.out.println("You Entered Invalid Plan");
			return;
			
	}
	
}
}

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

