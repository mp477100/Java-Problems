import java.util.Scanner;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		int seconds;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter total seconds:");
		
		seconds = scan.nextInt();
		int s = seconds % 60;
		int m = seconds / 60;
		int h = m % 60;
		
		m = m / 60;
		
		System.out.println(h +":"+ m +":"+ s);
		
	}
	

}