package org.assignment;

import java.util.Scanner;

public class Assignment18 {
	
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];
        int length = names.length;
        
        System.out.print("Enter 5 names :");
        for (int i = 0; i < length; i++) 
        {
            names[i] = scan.next();
        }

        String lengthyName = "";

       
        for (String name : names) {
        if (name != null && name.trim().length() > lengthyName.length()) {
                lengthyName = name;
            }
        }

      
        System.out.println("Longest name is " + lengthyName);
    }
}