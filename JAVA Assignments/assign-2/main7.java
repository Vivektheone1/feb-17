import java.util.Scanner;
public class main7{
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number");
	
	int num = sc.nextInt();
	
	if(num % 4==0){
	  if(num % 100==0){
	  if(num % 400 ==0){
	    System.out.println("leap year");
		}
		else{
		System.out.println("not a leap year");
		}
		}else {
          System.out.println("leap year");		
		}
		}else{
		System.out.println("not a leap year");
		
	  
	  
	  }
	  
	  }
	}
	
	