// Jeffery Tang
// APCS pd0
// Sorts
// 2022-01-07f
// time spent: 0.1 hrs

import java.util.ArrayList;

public class Sorts {
  public static void bubble( ArrayList<Comparable> data )
  {
    for ( int i = 0 ; i < data.size() - 1 ; i++) {
      // Amount of times we pass through the entire arraylist
      for ( int x = data.size() - 1 ; x > i ; x--) {
        // Allows us to compare consecutive values of elements on the array list
        if ((data.get(x).compareTo(data.get(x-1)) < 0)) {
          Comparable n = data.get(x-1);
          data.set(x, data.get(x-1));
          data.set(x-1, n);
        }
      }
    }
  }
  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = 0;
    for( int x = 0 ; x < data.size()-1 ; x += 1) {
      System.out.println( "\nbegin pass " + (data.size()-x) );//diag
      for( int y = 0 ; y <= data.size() - x ; y += 1 ) {
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
        if ( (data.get(maxPos)).compareTo(data.get(y)) < 0 ) {
          maxPos = y;
        }
      }
      Comparable t = data.get(data.size()-x);
      data.set(data.size()-x, data.get(maxPos));
      data.set(maxPos, t);
      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  public static void insertion( ArrayList<Comparable> data )
  {
    for( int partition = 1 ; partition < data.size() ; partition++ ) {
      //partition marks first item in unsorted region
      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );
      for( int index = partition - 1 ; index >= 0; index-- ) {
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(index).compareTo(data.get(index + 1)) > 0) {
          System.out.println( "swap indices "+(index+1)+" & "+index+"..." ); //diag
          Comparable temp = data.get(index);
          data.set(index, data.get(index +1));
          data.set(index +1, temp);
        }
        else
          break;
      }
    }
  }//end insertionSortV
}
