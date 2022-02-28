package org.assignment;

import java.util.Scanner;

public class Assignment17 {
	
    public void search(int m[], int ns) {
        boolean found = false;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == ns)
            {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");
    }
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }
        
        System.out.print("Enter number to search: ");
        int num = scan.nextInt();
        
        Assignment17 obj = new Assignment17();
        obj.search(arr, num);
        
        
  
		
	}

}
