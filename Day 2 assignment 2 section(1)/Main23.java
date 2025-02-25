/*
public class Main23 {

public static void main(String[] args) {

int level = 1;

switch(level) {

case 1:
System.out.println("Level 1");

case 2:
System.out.println("Level 2");

case 3:
System.out.println("Level 3");

default:
System.out.println("Unknown level");
}
}
}
*/



/*The break statement in Java serves to prematurely terminate the execution of a loop (for, while, or do-while) or a switch statement
*/


public class Main23 {

public static void main(String[] args) {

int level = 1;

switch(level) {

case 1:
System.out.println("Level 1");
break;

case 2:
System.out.println("Level 2");
break;

case 3:
System.out.println("Level 3");
break;

default:
System.out.println("Unknown level");
}
}
}