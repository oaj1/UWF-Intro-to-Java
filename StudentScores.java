public class StudentScores {
   public static void main (String [] args) {
      final int NUM_POINTS = 4;
      int[] dataPoints = new int[NUM_POINTS];
      int minVal = 0;
      int i = 0;

      dataPoints[0] = 2;
      dataPoints[1] = 12;
      dataPoints[2] = 9;
      dataPoints[3] = 20;

      minVal = 10;

      /* Your solution goes here  */
      for (i = 0; i < NUM_POINTS; ++i){
         if (dataPoints[i] < minVal){
            dataPoints[i]= dataPoints[i] *2;
            }else{
               dataPoints[i] = dataPoints[i] *1;
               }
         }

      for (i = 0; i < NUM_POINTS; ++i) {
         System.out.print(dataPoints[i] + " ");
      }
      System.out.println();

      return;
   }
}