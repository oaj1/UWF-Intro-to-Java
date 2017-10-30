import java.util.Scanner;

public class SumVectorElements {
   public static void main (String [] args) {
      final int NUM_VALS = 4;
      int[] origList = new int[NUM_VALS];
      int[] offsetAmount = new int[NUM_VALS];
      int i = 0;

      origList[0] = 40;
      origList[1] = 50;
      origList[2] = 60;
      origList[3] = 70;

      offsetAmount[0] = 5;
      offsetAmount[1] = 7;
      offsetAmount[2] = 3;
      offsetAmount[3] = 0;

      /* Your solution goes here  */
      for (i=0; i < NUM_VALS; ++i){
         System.out.print ( origList[i] + offsetAmount[i] + " ");
         
         }

      System.out.println("");

      return;
   }
}