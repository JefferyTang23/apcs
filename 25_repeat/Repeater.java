/**
   NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
   APCS
   HW25 -- Repeater
   2021-10-26
   time spent: .4
**/

/**
   DISCO: 
   QCC: 
**/

public class Repeater {
  public static String fenceW(int numPosts) {
    String fence = "|";
    int counter = 1;
    while (counter < numPosts) {
      fence += "--|";
      counter += 1;
    }
    return fence;
  }
  public static String fenceR(int numPosts) {
    String fence = "|";
    if (1 < numPosts) {
      fence += "--|";
      fenceR(numPosts-1);
    }
    return fence;
  }
  public static void main( String[] args ) {
    System.out.println("While Test:");
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(3));
    System.out.println("Recursive Test:");
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(3));
  }
}