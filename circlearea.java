import java.util.*;
//import java.math.*;

public class circlearea {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of circle");
        double rad = sc.nextDouble();
        double area = Math.PI * rad * rad;
        System.out.println("The area of the circle is " + area);

    }
}
