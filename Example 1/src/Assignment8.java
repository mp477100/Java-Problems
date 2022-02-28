import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scan.nextDouble();
        System.out.print("Enter second number:");
        num2 = scan.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        scan.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}