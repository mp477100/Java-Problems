package org.assignment;

import java.util.Scanner;

public class Assignment14 {
	
		public static void main(String[  ] args) {
		       
				Scanner scan = new Scanner(System.in);
			
		        System.out.println("Enter the command line:");
		        
		        String argv = scan.next();
		        System.out.println("Your Command Line arguments are:"+argv);
		        
		        StringBuilder scan1=new StringBuilder(argv);  
				scan1.reverse();  
				scan1.toString(); 
				
				System.out.println("Your Reverse Command Line arguments are:"+scan1);
		        
		        for (String str: args)
		        {
		        System.out.println(str);
		        }
}
}

