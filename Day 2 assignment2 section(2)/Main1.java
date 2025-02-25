public class Main1 {

public static void main(String[] args) {

float num1 = 20.0f;
float num2 = 10.0f;

 Switch (*) {

      
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

   
      case '-':
        result = num - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;

    
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;

     
      case '/':
        result = num / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
}
}
}