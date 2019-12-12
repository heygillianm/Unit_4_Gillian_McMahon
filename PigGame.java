public class PigGame {
   private PigDie die;

   private PigPlayer player1 = new PigPlayer();
   private PigPlayer player2 = new PigPlayer();

   public PigGame() {
      die = new PigDie();
   }

   public boolean turn() { // returns true if game is over
      System.out.println("Player 1's turn");
      if (turn(player1)) {
         System.out.println("Player 1 wins!");
         return true;
      }
      System.out.println("\nPlayer 2's turn");
      if (turn(player2)) {
         System.out.println("Player 2 wins!");
         return true;
      }
      System.out.println("End of round");
      System.out.println("Player 1's score: " + player1.getScore());
      System.out.println("Player 2's score: " + player2.getScore());
      System.out.println();
      return false;
   }

   private boolean turn(PigPlayer player) { // returns true if player reaches 100
      System.out.println("Roll 1:");
      int roll1 = getRoll(player);
      System.out.println("\nRoll 2:");
      int roll2 = getRoll(player);

      if (roll1 == roll2 && roll1 == 1) {
         System.out.println("Oh no, snake eyes! Your score is reset :(");
         player.addScore(-player.getScore()); // sets score to 0 by subtracting current score
      } else if (roll1 != 1 && roll2 != 1) {
         System.out.println(roll1 + roll2 + " is added to your score.");
         player.addScore(roll1 + roll2);
      } else {
         System.out.println("Uh oh, you rolled a one. 0 is added to your score.");
      }

      if (player.getScore() >= 10) {
         return true;
      } else {
         return false;
      }
   }

   private int getRoll(PigPlayer player) {
      int roll = die.roll();
      System.out.println("Rolled a " + roll);
      if (player.rollAgain()) {
         roll = die.roll();
         System.out.println("Rolled a " + roll);
      }

      return roll;
   }
}