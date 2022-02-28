package assignment27;

import java.util.Scanner;


public class Tester {
	
	
	public static void main(String[] args) {
		
		CalculateArea obj = new CalculateArea();
		
		Scanner sc = new Scanner(System.in);
		
		obj.calculateArea(6.1f);
		
		obj.calculateArea(10,22);
		
		obj.calculateArea(6.1);
		
		obj.calculateArea(4,15);
	}

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
				
		CalculateArea arithmetic = new CalculateArea();
		double result = arithmetic.addition(n1, n2);
		System.out.println("Addition is : "+result);
		
		result = arithmetic.substraction(n1, n2);
		System.out.println("Substraction is : "+result);
		
		sc.close();
*/
	
