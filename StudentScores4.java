public class StudentScores4 {
   public static void main (String [] args) {
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i = 0;

      oldScores[0] = 10;
      oldScores[1] = 20;
      oldScores[2] = 30;
      oldScores[3] = 40;

      /* Your solution goes here  */
      for (i=0; i < SCORES_SIZE -1; ++i){
         newScores[i] = oldScores[i +1];
         
         }
         newScores[SCORES_SIZE - 1] = oldScores[SCORES_SIZE - SCORES_SIZE];

      for (i = 0; i < SCORES_SIZE; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();

      return;
   }
}