public class Loops {
  public static double power(double x, int n) {
    double xPowN = 1;
    for (int i = 0; i < n; i++) {
      xPowN = xPowN * x;
    }
    return xPowN;
  }
  public static int factorial(int n) {
    int result = 1;
    while (n > 0) {
      result = result * n;
      n = n - 1;
    }
    return result;
  }
  public static double myexp(double x, int n){
      double result = 1;
      double numer = 1;
      double denom = 1;
      for (int i = 1; i < n; i++) {
         result = result + (numer = numer * x) / (denom = denom * i);
      }
      return result;
   }
  public static void check(double x){
    System.out.println(x + "\t" + myexp(x, 20) + "\t" + Math.exp(x));
  }
  public static void main(String[] args){
    System.out.println(power(2, 3));
    System.out.println(factorial(4));
    for (double i = 0.1; i <= 100; i = i * 10){
      check(i); //The values for 0.1, 1.0, and 10.0 are close but 100.0 is far from accurate.
  }
    for (double i = 0.1; i <= 100; i = i * 10){
      check(i * -1); //The values for -0.1 and -1.0, are close but -10.0 and -100.0 are far from accurate.
  }
  }
}
