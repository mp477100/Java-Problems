import java.util.Scanner;

public class Assignment7 {
	
	public static void main(String[] args) {
		
		double num1,num2,sub,mul,div,add;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the operation to perform on numbers:");
		
		String mathType = scan.next();
		
		if (mathType.equalsIgnoreCase("add")) {
			
			System.out.println("Enter two numbers to perform addition:");
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			
			add = num1 + num2;
			System.out.println("The addition is:");
			System.out.println(add);
		}
		else if(mathType.equalsIgnoreCase("sub")) {
			
			System.out.println("Enter two numbers to perform Subtraction:");
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			
			sub = num1 - num2;
			System.out.println("The Subtraction is:");
			System.out.println(sub);		
		}
		else if(mathType.equalsIgnoreCase("mul")) {
			
			System.out.println("Enter two numbers to perform Multiplication:");
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			
			mul = num1 * num2;
			System.out.println("The Multiplication is:");
			System.out.println(mul);					
		}
		else if(mathType.equalsIgnoreCase("div")) {
			
			System.out.println("Enter two numbers to perform Division:");
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			
			div = num1 / num2;
			System.out.println("The Division is:");
			System.out.println(div);				
		}
		else {
			
		System.out.println("You entered wrong Operation!");
			
		}
		}
	
}