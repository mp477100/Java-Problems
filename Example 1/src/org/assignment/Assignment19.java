package org.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment19 {
	
	  public static void main(String args[])  
	  {  
	    int c, n, search, array[];  
	   
	    Scanner in = new Scanner(System.in);  
	    System.out.println("Enter number of elements");  
	    n = in.nextInt();   
	    array = new int[n];  
	   
	    System.out.println("Enter those " + n + " elements");  
	   
	    for (c = 0; c < n; c++)  
	      array[c] = in.nextInt();  
	   
	    System.out.println("Enter value to find");  
	    search = in.nextInt();  
	   
	    for (c = 0; c < n; c++)  
	    {  
	      if (array[c] == search)     /* Searching element is present */  
	      {  
	         System.out.println(search + " is present at location " + (c + 1) + ".");  
	          break;  
	      }  
	   }  
	   if (c == n)  /* Element to search isn't present */  
	      System.out.println(search + " isn't present in array.");  
	  }  
	
}

	
	
	/*
	

		   public static void main(String[] args) {
			      Scanner scan = new Scanner(System.in);
			      
			      System.out.println("Enter the size of the array that is to be created: ");
			      
			      int size = scan.nextInt();
			      String[] myArray = new String[size];
			      
			      System.out.println("Enter the elements of the array: ");
			      
			      for(int i=0; i<size; i++)
			      {
			         myArray[i] = scan.toString();
			      }
			      System.out.println("Enter the value tobe searched: ");
			      String searchVal = scan.next();
			      for (int i =0 ; i<myArray.length; i++) {
			          if (myArray[i] == searchVal) {
			             System.out.println("The index of element "+searchVal+" is : " + i);
			          }
			       }
			    }
			 }

*/
/*
	
	public static boolean search(String name, array) {

	
	 boolean found = Arrays.stream(array)
             .anyMatch(item -> item.getName().equals(name));

   if (found) {
      System.out.println(name+ " is found\n");
   }
   else {
     System.out.print("\nName not in list\n");
   }

   return found;
}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String arr[] = new String[5];
        System.out.println("Enter 5 words:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.next();
        }
        
        System.out.print("Enter String to search: ");
        String num = scan.next();
        
        Assignment19 obj = new Assignment19();
        obj.search(arr, num);
	}

}
*/