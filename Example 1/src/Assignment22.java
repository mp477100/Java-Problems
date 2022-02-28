import java.util.Scanner;

public class Assignment22 {
	
	public static void main(String[] args) {
		
		
	}
		
        
        Scanner scan=new Scanner(System.in);
        
		    class Arithmatic{
		    	
		    	void addition(int num1, int num2){
		    		
		        System.out.print("Addition of given numbers = ");
		        System.out.println(num1 + num2);
		      } 
		    	
		      
		    	void subtraction(int num1, int num2){
		            System.out.print("Subtraction of given numbers = ");
		            System.out.println(num1 - num2);
		      }     
		        
		    	void multiplication(int num1, int num2){
		            System.out.print("Multiplication of given no.s = ");
		            System.out.println(num1 * num2);
		      }
		    	
		    	void division(int num1, int num2){
		            System.out.print("Division of given given no.s = ");
		            System.out.println(num1 / num2);
		      }
		    	void moduloDivision(int num1, int num2){
		            System.out.print("ModuloDivision of given no.s = ");
		            System.out.println(num1 % num2);
		    }
		    	  public void main(String args[]){
		              addition(20, 10);
		              subtraction(40, 30);
		              multiplication(20, 30);
		              division(20, 4);
		              moduloDivision(20, 3);
		        }
		  }

}
