/*
public class Main4{

public static void main(String[] args) {

for (int i = 10; i >= 0; i++) {

System.out.println(i);
}
}
}
*/

// error : infinite loop


// correct code

public class Main4{

public static void main(String[] args) {

for (int i = 10; i >= 0; i--) {

System.out.println(i);
}
}
}