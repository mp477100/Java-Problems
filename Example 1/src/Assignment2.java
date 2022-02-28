import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		double height,breath,RAtriangle;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Height and Breath of Triangle:");
		height = scan.nextDouble();
		breath = scan.nextDouble();
		
		System.out.println("Area of Right angle Triangle is:");
		RAtriangle = 0.5 * height * breath;
		
		System.out.println(RAtriangle);
		
		
	}

}
