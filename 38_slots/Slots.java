/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
HW38 -- Stimulating a slots machine
2021-11-17
time spent:  0.5 hours
DISCO
- Using extra parenthesis around boolean expressions allows you to manage them more cleanly. 
- A storage of one of the elements is needed when you want to swap two elements of an array. 
QCC
- What is the best way to cut out part of an array?
 *****************************************************/

public class Slots {

  //instance variable to represent master copy for slot machine
  private static final String[] FRUITS = {
    "lime", "lime", "lime",
    "lemon", "lemon", "lemon",
    "cherry", "cherry", "cherry",
    /*
      add extra fruits until your heart is content...
      Some suggestions:
    "orange", "orange", "orange",
    "grapefruit", "grapefruit", "grapefruit",
    "tangerine", "tangerine", "tangerine",
    "ugli", "ugli", "ugli",
    */
    "grapefruit", "grapefruit", "grapefruit",
    "dragonfruit", "dragonfruit", "dragonfruit",
    "peach", "peach", "peach"
  };

  private String[] _fruits; //to be init'd by each instance


  /*=====================================
    Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
  public Slots()
  {
    //allocate memory for _fruits based on size of FRUITS:
    _fruits = new String[FRUITS.length];


    //copy elements of FRUITS into _fruits:
    for (int i = 0; i < FRUITS.length; i++) {
      _fruits[i] = FRUITS[i];
    }

  }


  /*=====================================
    String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString()
  {
    String newstring = "";
    for (int i = 0; i < 3; i++) {
      newstring = newstring + _fruits[i] + "\t";
    }
    return newstring;
  }


  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/
  private void swap( int i, int j )
  {
    String oldI = _fruits[i];
    _fruits[i] = _fruits[j];
    _fruits[j] = oldI;
  }


  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
  public void spinOnce()
  {
    // A simple approach to shuffling:
    // iterate through the array, swapping
    // the val at each index with a randomly chosen other index
    for(int i = 0; i < _fruits.length; i++) {
      int random = (int) (Math.random()*_fruits.length);
      swap(i, random);
    }
  }


  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot()
  {
    boolean retBoo = false;
    if ((_fruits[0].equals(_fruits[1])) && (_fruits[0].equals(_fruits[2]))) {
      retBoo = true;
    }

    return retBoo;
  }


  /*=====================================
    boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct,
    false otherwise
    =====================================*/
  public boolean miniWin()
  {
    boolean retBoo = false;
    if (jackpot() || !(_fruits[0].equals(_fruits[1])) && !(_fruits[1].equals(_fruits[2])) && !(_fruits[2].equals(_fruits[0]))) {
      retBoo = true;
    }

    return retBoo;
  }


  //main() method for testing
  public static void main( String[] args ) {
    //usage: move bar below down 1 line at a time to test functionality...

    Slots machine01 = new Slots();
    Slots machine02 = new Slots();

    //test to verify slot machines function indepently
    System.out.println();
    System.out.println( "Machine01 initial state:\t" + machine01 );
    System.out.println( "Machine02 initial state:\t" + machine02 );

    System.out.println( "\nSpinning machine01...\n" );

    machine01.spinOnce();

    System.out.println();
    System.out.println( "Machine01 state:\t" + machine01 );
    System.out.println( "Machine02 state:\t" + machine02 );
    System.out.println();


    //test gamble-until-you-win mechanism

    System.out.println( "Preparing to spin until a mini win! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.miniWin() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "WIN\n" );



    System.out.println( "Preparing to spin until...jackpot! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.jackpot() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "JACKPOT!\n" );

  }//end main

}//end class Slots
