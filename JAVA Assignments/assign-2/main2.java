
import java.util.Scanner;

public class main2{
    public static void main(String[] args){
	 
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 
	  if((n & 1) == 0){
            System.out.println("The number " + n + " is Even.");
        } else {
            System.out.println("The number " + n + " is Odd.");
        }
	
	}
}