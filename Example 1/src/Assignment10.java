import java.util.Scanner;

public class Assignment10 {

	 public static void main(String[] args) {
	 
		 int num1 = 0,num2 = 1,count;
		 
		 Scanner scan = new Scanner(System.in);
		 
         System.out.print("Enter a number: ");

		 count = scan.nextInt();
		 
		 scan.close();
		 
	     System.out.print("Fibonacci Series of "+count+" numbers:");

		 int i=1;
		 while(i<count){
			 
			 System.out.print(num1+" ");
			 int sum = num1 + num2;
			 num1 = num2;
			 num2 = sum;
			 i++;
		 }
	 
	 }
}
