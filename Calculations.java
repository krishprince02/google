import java.util.Scanner;
public class Calculations {

  public static void main (String [] args) {

    Scanner console = new Scanner (System.in);
    int a = 0;
    int b = 0;
    int sum = 0;
    int product = 0;
    System.out.println ("Enter the Lower Bound");
    a = console.nextInt();
    System.out.println("Enter the Upper Bound");
    b = console.nextInt();

    while (a <= b) {
     product *= a;
     sum += a;
      a++;
    }
    System.out.println("The sum is " + sum);
    System.out.println("The Product " + product);

  }
}
