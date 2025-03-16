import java.util.Scanner;

public class main10{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch = sc.next().charAt(0);
	String result = ( ch=='A'||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )?
	"vowel":"consonant";
	System.out.println(result);
	}
}