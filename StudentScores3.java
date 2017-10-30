public class StudentScores3 {
   public static void main (String [] args) {
      final int SCORES_SIZE = 4;
      int[] bonusScores = new int[SCORES_SIZE];
      int i = 0;

      bonusScores[0] = 10;
      bonusScores[1] = 20;
      bonusScores[2] = 30;
      bonusScores[3] = 40;

      /* Your solution goes here  */
      
      // new scores will be a place holder array with size of 4
      int [] newScores = new int [SCORES_SIZE];
      //newScores will hold all the values of bonusScores
      newScores = bonusScores;
      
      //this loop only handles 10 - 30 because of the SCORE_SIZE -1;
      for (i=0; i < SCORES_SIZE-1; ++i){
         //for each index of i, add the previous index with the next index
         newScores[i] = newScores[i] + newScores[i+1];
         
         }

      for (i = 0; i < SCORES_SIZE; ++i) {
         System.out.print(bonusScores[i] + " ");
      }
      System.out.println();

      return;
   }
}