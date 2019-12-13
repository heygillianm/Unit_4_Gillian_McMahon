public class PigDieTester{
    public static void main (String [] args){
        PigTheGame newGame = new PigTheGame();

        System.out.println("Welcome to Pig Dice!");

        boolean gameOver = false;
        while (!gameOver) {
            gameOver = newGame.turn();
        }
        System.out.println("\nThanks for playing!\n");
    }
}