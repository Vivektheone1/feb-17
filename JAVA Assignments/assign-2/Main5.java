public class Main5{
    public static void main(String[] args) {
	
	int a = 10;
	int b = 5;
	System.out.println("Before swap a = "+ a + " , Bfore swap b = "+ b);
	
	a = a + b;
	b = a - b;
	a = a - b;
	 
	 System.out.println("After swap a = "+ a + " , After swap b = "+ b);
	}
}