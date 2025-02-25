/*
public class Main6 {

public static void main(String[] args) {

int count;

while (count < 10) {

System.out.println(count);

count++;
}
}
}
*/

// error : variable count might not have been initialized


// correct code

// we can initiate the value of count = 1


public class Main6 {

public static void main(String[] args) {

int count=1;

while (count < 10) {

System.out.println(count);

count++;
}
}
}
