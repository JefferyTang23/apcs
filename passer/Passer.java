/*Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
CW -- Passer
2021-11-29
time spent:  0.5 hours
*/

public class Passer {
  int a = 251;
  String h = "Hello";
  int[] i = {1, 2, 0};
  public static void main(String[] args) {
    Passer demo = new Passer();
    System.out.println("Value of a before: " + demo.a);
    demo.change(demo.a);
    System.out.println("Value of a after: " + demo.a);
    System.out.println("Value of h before: " + demo.h);
    demo.changeStr(demo.h);
    System.out.println("Value of h after: " + demo.h);
    printArray(demo.i);
    demo.changeArr(demo.i);
    printArray(demo.i);
  }
  public void change(int target) {
    target += 100;
  }
  public void changeStr(String target) {
    target += ", world!";
  }
  public void changeArr(int[] target) {
    target[2] = 3;
  }
  public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
}
