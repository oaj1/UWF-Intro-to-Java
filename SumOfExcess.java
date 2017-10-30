import java.util.Scanner;

public class SumOfExcess {
   public static void main (String [] args) {
      final int NUM_VALS = 4;
      int[] testGrades = new int[NUM_VALS];
      int i = 0;
      int sumExtra = -9999; // Assign sumExtra with 0 before your for loop

      testGrades[0] = 101;
      testGrades[1] = 83;
      testGrades[2] = 107;
      testGrades[3] = 90;

      /* Your solution goes here  */
      sumExtra=0;
      for (i=0; i < NUM_VALS; ++i){
         if (testGrades[i] > 100){
            sumExtra = sumExtra + (testGrades[i] -100);
            }
         }

      System.out.println("sumExtra: " + sumExtra);

      return;
   }
}