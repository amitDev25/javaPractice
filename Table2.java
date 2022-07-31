import java.util.*;

public class Table2 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number to make the table");
    int a = sc.nextInt();
    int x;
    for (int i = 1; i < 11; i++ ) {
      x = a * i;
      System.out.println(a + " x " + i + " = " + x);

    }   
    }
}
