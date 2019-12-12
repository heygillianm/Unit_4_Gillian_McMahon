import java.util.Random;

public class PigDie {
   private Random roller;

   public PigDie() {
      roller = new Random();
   }

   public int roll() {
      return roller.nextInt(6) + 1;
   }
}