import java.util.*;

public class marks {
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 to enter the marks or Enter 0 to stop the process");
    int x = sc.nextInt();
    if (x == 1){
    System.out.println("Enter the marks between 0 to 100");
        int i = sc.nextInt();
  if (i >= 101) {
        System.out.println("Marks doesn't exist");
  } else if (i >= 90){
        System.out.println("This is Good");
    } else if (i >= 60 ) {
        System.out.println("This is also Good");
        
    } else if (i >= 0){
        System.out.println("This is Good as Well");

    } else {System.out.println("Marks doesn't exist");}

     } }
}
