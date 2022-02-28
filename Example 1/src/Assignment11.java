import java.util.Scanner;

public class Assignment11 {
	
	 public static void main(String[] args) {
	 	
		 Scanner scan=new Scanner(System.in);         
			System.out.println("Enter a number");
			int n = scan.nextInt();			        
			int count=0;
			for(int i = 1 ; i <=n ; i++)	
			{	
				if(n % i == 0)				
				count=count+1;
			}
			if(count == 2)		                      
			System.out.println("Prime Number");
			else
			System.out.println("Not a Prime Number");
			scan.close();		
		     
	 }
}
