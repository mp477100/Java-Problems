import java.util.Scanner;

public class Tester {
	
	public static void main(String args[])
	{
		double num1,num2,num3,average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Three integers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		System.out.println("The Average of three numbers is:");
		double sum = num1+num2+num3;
		average = sum/3;
		System.out.println(average);
		
	}

}
