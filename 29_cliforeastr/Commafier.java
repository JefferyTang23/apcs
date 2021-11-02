/**
   NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
   APCS
   HW29 -- int to String w/ Comma
   2021-11-01
   time spent: 
**/

public class Commafier {
  public static String commafyR(int n) {
    String nToS = "" + n;
    String nr = reverseF(nToS);
    String[] threes;
    if (nToS.length() < 4) {
      return nToS;
    }else {
      for (int i = 0 ; i < nr.length() ; i += 1) {

      }
    }
    return n;
  }
  public static int commafyF(int n) {
    return n;
  }
  public static String reverseF(String s) {
    String r = "";
    for (int i = 1 ; i - 1< s.length() ; i++) {
       r += s.substring(s.length() - i, s.length() - i + 1);
    }
    return r;
  }
  public static void main(String[] args) {
    System.out.println(commafyR(25));
  }
}
