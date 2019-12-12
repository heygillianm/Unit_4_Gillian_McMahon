import java.util.Scanner;

public class PigPlayer {
   private int score;

   public PigPlayer() {
      score = 0;
   }

   public int getScore() {
      return score;
   }

   public void addScore(int value) {
      score += value;
   }

   public boolean rollAgain() {
      Scanner scan = new Scanner(System.in);

      System.out.print("Would you like to roll again? (y/n) ");
      char answer = scan.next().toLowerCase().charAt(0); // first char of answer
      return answer == 'y';
   }
}