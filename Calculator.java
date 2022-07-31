import java.util.*;
public class Calculator {
    public static void main (String [] args) {
   Scanner calculator = new Scanner(System.in);
    System.out.println("Enter your first number");
    int no1 = calculator.nextInt();
    System.out.println("Enter your second number");
    int no2 = calculator.nextInt();
    System.out.println("Enter your function ie. 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division ");
    int no3 = calculator.nextInt();
    int a = no1 + no2;
    int b = no1 - no2;
    int c = no1 * no2;
    int d = no1 / no2;

    if (no3 == 1) {
        System.out.println("Your answer is " + a);
   
    }
    else if (no3 == 2) {
        System.out.println("Your answer is " + b);
    
    }
    else if (no3 == 3) {
        System.out.println("Your answer is " + c);
    
    }
    else if (no3 == 4) {
        System.out.println("Your answer is " + d);

    }
    else {
        System.out.println("Syntax error");

    }



    


    }
}
    