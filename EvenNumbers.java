import java.util.*;

public class EvenNumbers {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Limit");
    int n = sc.nextInt();
    for (int i = 0; i <= n; i = i + 2){
        System.out.println(i);

    }    
    }
}
