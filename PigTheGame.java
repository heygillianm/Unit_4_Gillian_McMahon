import java.util.Scanner;

public class PigTheGame {
    PigGamePlayer player1;
    PigGamePlayer player2;
    Scanner scan;
    PigGameDie dice1;
    PigGameDie dice2;

    public PigTheGame() {
        player1 = new PigGamePlayer();
        player2 = new PigGamePlayer();
        scan = new Scanner(System.in);
        dice1 = new PigGameDie();
        dice2 = new PigGameDie();
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

        private boolean turn(){
            System.out.println("Would you like to roll or pass? (r/p)");
            String answer = scan.nextLine();
            while (answer.equals("r")) {
                System.out.println("Player 1 turn.");
                int roll1 = dice1.roll();
                System.out.println("Roll 1: " + roll1);
                int roll2 = dice2.roll();
                System.out.println("\nRoll 2: " + roll2);

                if (roll1 == roll2 && roll1 == 1) {
                    System.out.println("Oh no! You rolled snake eyes! Score reset to zero.");
                    player1.addScore();
                } else if (roll1 == 1 || roll2 == 1) {
                    System.out.println("Uh oh, you rolled a one. Round score is reset to zero.");
                    player1.addScore();
                } else {
                    System.out.println(roll1 + roll2 + " is added to your score");
                    player1.addScore();
                    System.out.println("Would you like to roll again or pass your turn?");
                    answer = scan.nextLine();
                }
            }
            System.out.println("Player 2 turn.");
            System.out.println("Enter 'r' to play.");
            String nextTurn = scan.nextLine();
            while (nextTurn.equals("r")) {
                int roll1 = dice1.roll();
                System.out.println("Roll 1: " + roll1);
                int roll2 = dice2.roll();
                System.out.println("Roll 2: " + roll2);

                if (roll1 == roll2 && roll1 == 1) {
                    System.out.println("Oh no! You rolled snake eyes! Score reset to zero.");
                    player2.addScore();
                } else if (roll1 == 1 || roll2 == 1) {
                    System.out.println("Uh oh, you rolled a one. Round score is reset to zero.");
                    player2.addScore();
                } else {
                    System.out.println(roll1 + roll2 + " is added to your score");
                    player2.addScore();
                    System.out.println("Would you like to roll again or pass your turn? (r/p)");
                    nextTurn = scan.nextLine();
                }
            }
        }
    }
}