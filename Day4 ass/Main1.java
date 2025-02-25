/*
public class Main1 {

public static void main(String[] args) {

int count = 5;

while (count=0) {

System.out.println(count);

count--;
}
}
}
*/


/*incompatible types: int cannot be converted to boolean
while (count = 0) {
*/
// correct code

  public class Main1 {

public static void main(String[] args) {

int count = 5;

while (true) {

System.out.println(count);

count--;
break;
}
}
}