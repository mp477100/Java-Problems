import java.util.Scanner;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three Numbers:");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
			if (num1 >= num2 && num1 >= num3) {
			
			System.out.println("Largest number is:");
			System.out.println(num1);
			}
			else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Largest number is:");
			System.out.println(num2);
			}
			else {
				System.out.println("Largest number is:");
				System.out.println(num3);
			
			}
			
		
		}
		
		
		
		
	}



		