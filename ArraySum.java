
import java.util.Scanner;

public class ArraySum {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i = 0;                              // Loop index
      int sumVal = 0;                         // For computing sum

      // Prompt user to populate array
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         System.out.println("Value: ");
         userVals[i] = scnr.nextInt();
      }

      // Determine sum
      sumVal = 0;
      
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         sumVal = sumVal + userVals[i];
      }
      System.out.println("Sum: " + sumVal);
      System.out.println("Avg: " + sumVal/8);

      return;
   }
}
