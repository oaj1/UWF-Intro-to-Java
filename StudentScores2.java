public class StudentScores2 {
   public static void main (String [] args) {
      final int SCORES_SIZE = 4;
      int[] lowerScores = new int[SCORES_SIZE];
      int i = 0;

      lowerScores[0] = 5;
      lowerScores[1] = 0;
      lowerScores[2] = 2;
      lowerScores[3] = -3;

      /* Your solution goes here  */
      for (i=0; i < SCORES_SIZE; ++i){
         lowerScores[i] = lowerScores[i] - 1;
         if (lowerScores[i] <=0 ){
            lowerScores[i] = 0;
            }
         }

      for (i = 0; i < SCORES_SIZE; ++i) {
         System.out.print(lowerScores[i] + " ");
      }
      System.out.println();

      return;
   }
}