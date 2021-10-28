/**
   NIWWD: Hugo Jenkins + <duck name>, Jeffery Tang + Mathias, Melody Lew + <duck name>
   APCS
   HW27 -- FOR the Love of Strings
   2021-10-28
   time spent: 0.4
**/

/**
   DISCO:
   
   QCC:
   
**/


public class Rof {
 
  public static String FenceF(int posts) {
     String f = "|";
     for (int i = 1 ; i < posts ; i++) {
        f += "--|";
     }
     return f;
  }
  public static String reverseF(String s) {
     String r = "";
     for (int i = 1 ; i < s.length() ; i++) {
        r += s.substring(s.length() - i, s.length() - i + 1);
     }
     return r;
  }
  public static String reverseR(String s) {
   String r = "";
   if (s.length() > 1) {
      r += s.substring(s.length() - 1, s.length()) + reverseR(s.substring(0, s.length() - 1));
   }
   return r;
}

  public static void main(String[] args) {
    System.out.println("FenceF test:");
    System.out.println(FenceF(1));
    System.out.println(FenceF(2));
    System.out.println(FenceF(3));
    System.out.println("ReverseF test:");
    System.out.println(reverseF("stressed"));
    System.out.println("ReverseR test:");
    System.out.println(reverseR("stressed"));
  }
}
