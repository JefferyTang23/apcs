/**
   NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
   APCS
   HW28 -- PPMP
   2021-10-29
   time spent: 0.8
**/

public class string2 {
  public static String doubleChar(String str) {
    String dc = "";
    for (int i = 0 ; i < str.length() ; i++) {
      dc += str.substring(i, i + 1) + str.substring(i, i + 1);
    }
    return dc;
  }
  public static int countHi(String str) {
    int counter = 0;
    for (int i = 0 ; i < str.length() - 1 ; i++) {
      if ((str.substring(i, i +2)).equals("hi")) {
        counter += 1;
      }
    }
    return counter;
  }
  public static boolean catDog(String str) {
    int cc = 0;
    int dc = 0;
    for (int i = 0 ; i < str.length() - 2 ; i++) {
      if ((str.substring(i, i + 3)).equals("cat")) {
        cc += 1;
      } else if ((str.substring(i, i + 3)).equals("dog")) {
        dc += 1;
      }
    }
    return cc==dc;
  }
  public static int countCode(String str) {
    int counter = 0;
    for (int i = 0 ; i < str.length() - 3 ; i++) {
      if ((str.substring(i, i +2)).equals("co") && (str.substring(i + 3, i +4)).equals("e")) {
        counter += 1;
      }
    }
    return counter;
  }
  public static boolean endOther(String a, String b) {
    int al = a.length();
    int bl = b.length();
    if (al >= bl) {
      return ((a.substring(al - bl)).toLowerCase()).equals(b.toLowerCase());
    } else if (bl > al) {
      return ((b.substring(bl - al)).toLowerCase()).equals(a.toLowerCase());
    }
    return false;
  }
  public static boolean xyzThere(String str) {
    int counter = 0;
    if (str.length() >= 3) {
      if ((str.substring(0, 3)).equals("xyz")) {
      counter += 1;
      }
    }
    for (int i = 0 ; i < str.length() - 3 ; i++) {
      if ((!(str.substring(i, i + 1)).equals(".")) && (str.substring(i + 1, i + 4)).equals("xyz")) {
        counter += 1;
      }
    }
    return counter > 0;
  }
  public static void main(String[] args) {
    System.out.println("doubleChar test:");
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("Hi-There"));
    System.out.println("countHi test:");
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hihi"));
    System.out.println("catDog test:");
    System.out.println(catDog("catdog"));
    System.out.println(catDog("catcat"));
    System.out.println(catDog("1cat1cadodog"));
    System.out.println("countCode test:");
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
    System.out.println("endOther test:");
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
    System.out.println("xyzThere test:");
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
  }
}
