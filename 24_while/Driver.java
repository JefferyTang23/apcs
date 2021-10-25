/***
Monke: Prattay Dey + Winnie, Jeffery Tang + Mathias
APCS
HW23 -- Coin
2021-10-23
time spent: 0.8
 ***/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
    //===================TOP==========================
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }

      flipWhile(50, 70000, 2005, yours, wayne);
      //====================BOTTOM======================

  }//end main()
  public static void flipWhile(int x, int y, int z, Coin m, Coin n) {
    m.reset ("heads", 0.5);
    n.reset ("heads", 0.5);
    while (m.headsCtr + n.headsCtr <= x && m.matchCtr <= y & m.matchCtr <= 65536 && m.matchCtr%z == 0) {
      m.flip();
      n.flip();
    }
    System.out.println("Number of heads: ");
    System.out.println(m.getHeadsCtr());
    System.out.println(n.getHeadsCtr());
    System.out.println("Number of matches: ");
    //System.out.println(m.matchCtr());
  }
}//end class
