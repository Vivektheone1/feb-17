
import java.util.Scanner;
public class main6{
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("enter the number");
	
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	 
	 
	 int greatest = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
					System.out.println("Greatest is "+ greatest);
	
	}
	}