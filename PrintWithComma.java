import java.util.Scanner;

public class PrintWithComma {
   public static void main (String [] args) {
      final int NUM_VALS = 4;
      int[] hourlyTemp = new int[NUM_VALS];
      int i;

      hourlyTemp[0] = 90;
      hourlyTemp[1] = 92;
      hourlyTemp[2] = 94;
      hourlyTemp[3] = 95;

      /* Your solution goes here  */
      for(i=0; i < NUM_VALS; ++i){
         
         System.out.print(hourlyTemp[i] );
         
         //if i is essentiall less than the third element, NUM_VALS = 4, thus say if i is less than 3
         //SO ESSENTIALLY this means that i will only get a comma and space for indexes 0 -2!
         if (i < NUM_VALS -1){
            System.out.print(",");
            System.out.print(" ");
            }
         }

      System.out.println("");
   }
}