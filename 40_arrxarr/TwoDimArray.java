
/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW40 -- 2D arrays
2021-11-30
time spent:  0.5 hours

DISCO
- The number of rows in an array of arrays is equal to its length.

QCC
- Are there advantages to using foreach instead of for for arrays outside of shorter code.
 *****************************************************/

/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for ( int[] k : a) {
      for (int i : k) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }


   //postcond: returns sum of all items in 2D int array a
   public static int sum1( int[][] a )
   {
     int answer = 0;
     for (int i = 0; i < a.length; i++) {
       for (int j = 0; j < a[i].length; j++) {
         answer += a[i][j];
       }
     }
     return answer;
   }


   //postcond: returns sum of all items in 2D int array a
   //          * uses helper fxn sumRow
   public static int sum2( int [][] m )
   {
     int counter = 0;
     int answer = 0;
     for (int[] array : m) {
       answer += sumRow1(counter, m);
       counter += 1;
     }
     return answer;
   }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int answer = 0;
    for (int j = 0; j < a[r].length; j++) {
      answer += a[r][j];
    }
    return answer;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;
    for (int a : m[r]) {
      summer += a;
    }
    return summer;
  }


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));

      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
