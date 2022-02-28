package org.assignment;
import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		double radius,area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle");
		radius = scan.nextDouble();
		
		System.out.println("Area of Circle is:");
		
		area = 3.14 * radius*radius;
		
		System.out.println(area);

		
	}

}
