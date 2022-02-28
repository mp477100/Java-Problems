package geom;

import java.util.Scanner;

public class Tester {

	   public static void main(String[] args) {
	   Rectangle obj = new Rectangle(); 
	   Scanner scan = new Scanner (System.in);
	   float len,width;
	       System.out.println("Enter the length of the Rectangle");
	       len = scan.nextFloat();
	       System.out.println("Enter the width of the Rectangle");
	       width = scan.nextFloat();
	       obj.setLength(len);
	       obj.setWidth(width);
	       System.out.println("Length of the Rectangle is : "+obj.getLength());
	       System.out.println("Width of the Rectangle is : "+obj.getWidth());
	       System.out.println("Area of the Rectangle is : "+obj.area());
	       System.out.println("Perimeter of the Rectangle is : "+obj.perimeter());
	   }
}


