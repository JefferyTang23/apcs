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
    String cr = "";
    String[] threes = {};
    int ti = 0;
    if (nToS.length() < 4) {
      return nToS;
    }else {
      System.out.println(nr);
      for (int i = 0 ; i < nr.length() ; i += 3) {
        System.out.println(nr.substring(i));
        if ((nr.substring(i)).length() < 3) {
          threes[ti] = nr.substring(i);
        }else {
          threes[ti] = nr.substring(i, i + 3) + ",";
          ti += 1;
        }
      }
    }
    for (int e = 0 ; e < threes.length ; e += 1) {
      cr += threes[e];
    }
    return reverseF(cr);
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
    System.out.println(commafyR(1));
    System.out.println(commafyR(10));
    System.out.println(commafyR(101));
    System.out.println(commafyR(1000));
    System.out.println(commafyR(12345));
  }
}
