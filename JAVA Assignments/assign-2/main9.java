import java.util.Scanner;

public class main9{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	String result = (a>=0 && a<=20)? "within the range." :"not in the range.";
	System.out.print(result);
	
	}
	}