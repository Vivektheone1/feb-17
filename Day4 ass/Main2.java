/*
public class Main2 {

public static void main(String[] args) {

int num = 0;

do {

System.out.println(num);

num++;
}

   while (num > 0);

}
}
*/

// infinite loop:


public class Main2 {

public static void main(String[] args) {

int num = 0;

do {

System.out.println(num);

num++;
break;
}
 while (num > 0);
 

}
}
