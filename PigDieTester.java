import java.sql.SQLOutput;
import java.util.Scanner;

public class PigDieTester {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        PigDie player1 = new PigDie();
        PigDie computer = new PigDie();
        PigPlayer playerScore = new PigPlayer();
        PigPlayer computerScore = new PigPlayer();
        boolean playerTurn = true;
        boolean computerTurn = false;

        System.out.println("Welcome to Pig Die!");
        System.out.println("Enter 'roll' to play")

        while (/*player 1 turn*/){
            player1.rolls();
            if (playerScore.isOne == true){
                System.out.println("You had ones! Score is reset to zero.");
            }
            else (playerScore.isOne == false){
                System.out.println("Sum of your rolls is: " + playerScore.total());
            }
            System.out.println("Would you like to roll again or pass?");
            System.out.println("To roll again enter 'roll', to pass enter 'pass'");
            String answer = scan.nextLine();
        }
    }
}
