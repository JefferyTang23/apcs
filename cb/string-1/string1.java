/**
   NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
   APCS
   HW28 -- PPMP
   2021-10-29
   time spent: 0.8
**/

public class string1 {
  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }
  public static String helloName(String name) {
    return "Hello " + name + "!";
  }
  public static void main(String[] args) {
    System.out.println("helloName test:");
    System.out.println(helloName("Bob"));
    System.out.println(helloName("Alice"));
    System.out.println(helloName("X"));
    System.out.println("makeAbba test:");
    System.out.println(makeAbba("Hi", "Bye"));
    System.out.println(makeAbba("Yo", "Alice"));
    System.out.println(makeAbba("What", "Up"));
  }
}
