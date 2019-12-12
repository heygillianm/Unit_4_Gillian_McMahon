import java.util.Scanner;

public class PigTheGame {
    PigGamePlayer player1;
    PigGamePlayer player2;
    Scanner scan;
    PigGameDie dice1;
    PigGameDie dice2;

    public PigGame(){
        player1 = new PigGamePlayer();
        player2 = new PigGamePlayer();
        scan = new Scanner(System.in);
        dice1 = new PigGameDie();
        dice2 = new PigGameDie();
    }

    public void start(){
        System.out.println("Would you like to roll or pass? (r/p)");
        String answer = scan.nextLine();

        while (answer.equals("r")){
            dice1.roll();

        }
    }
}
