public class Arrays {
  public static double[] powArray(double[] a, double power) {
    double[] powered = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      powered[i] = Math.pow(a[i], power);
    }
    return powered;
  }
  public static int[] histogram(int[] a, int numCounters) {
    int[] counter = new int[numCounters];
    for (int element : a){
        counter[element]++;
    }
    return counter;
  }
  public static int indexOfMax(int[] a) {
    int currentMax = 0;
    int maxIndex = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > currentMax) { //an enhanced for loop would not work because we are comparing elements in the same set.
        maxIndex = i;
        currentMax = a[1];
      }
    }
    return maxIndex;
  }
  public static boolean[] sieve(int n) {
    int[] a = new int[n];
    boolean[] primeTF = new boolean[n];
    for (int i = 0; i < n; i++) {
      a[i] = i;
    }
    for (int b = 2; b < n; b++) {
      for (int c = 0; c < n; c++) {
        if (a[c] != b && a[c] % b == 0) {
          primeTF[c] = false;
        }
      }
    }
    for (int p = 0; p < n; p++) {
      if (primeTF[p] != false) {
        primeTF[p] = true;
      }
    }
    return primeTF;
   }
  public static void main(String[] args){
}
}
