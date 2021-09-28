import java.util.Scanner;

public class CToF {
      public static void main(String[] args){
        double c;
        Scanner in = new Scanner(System.in);
        System.out.println("Input Celsius: ");
        c = in.nextDouble();
        double f = ( c * 9 / 5 ) + 32;
        System.out.printf("%f C = %.1f F", c, f);
      }
}
