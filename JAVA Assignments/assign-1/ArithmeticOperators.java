
import java.util.Scanner;
public class ArithmeticOperators {
	
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = scanner.nextFloat();
        
        System.out.print("Enter the second number: ");
        float b = scanner.nextFloat();

        
        float sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        float difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        float product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);
		
        if (b != 0.0f) {
            float quotient = a / b;
            System.out.println("Division: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

       
        if (b != 0) {
            float remainder = a % b;
            System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }

       
        scanner.close();
    }
}