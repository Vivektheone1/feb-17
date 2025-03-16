import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean a = sc.nextBoolean();
	boolean b = sc.nextBoolean();
	boolean c = sc.nextBoolean();
	
	boolean result = (a && b) || (b && c) || (a && c);

System.out.println(result);
}
	}