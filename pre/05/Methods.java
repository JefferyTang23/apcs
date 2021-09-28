public class Methods {
  public static boolean isDivisible(int n, int m) {
    if (n % m == 0) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean isTriangle(int x, int y, int z) {
    if (((x + y) > z) && ((x + z) > y) && ((y + z) > x)) {
      return true;
    } else {
      return false;
    }
  }
  public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1;
    } else if (m > 0 && n == 0) {
      return ack(m - 1, 1);
    } else if (m > 0 && n > 0) {
      return ack(m - 1, ack(m, n - 1));
    } else {
      return -1;
  }
}
public static void main(String[] args){
  System.out.println(isDivisible(10, 5));
  System.out.println(isTriangle(15, 4, 8));
  System.out.println(ack(1, 1));
  }
}
