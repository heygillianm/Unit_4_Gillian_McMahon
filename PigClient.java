public class PigClient {
   public static void main(String[] args) {
      PigGame game = new PigGame();

      boolean gameOver = false;
      while (!gameOver) {
         gameOver = game.turn();
      }
      System.out.println("\nThanks for playing!\n");
   }
}