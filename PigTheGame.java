import java.util.Scanner;

public class PigTheGame {
    PigGamePlayer player1;
    PigGamePlayer player2;
    Scanner scan;
    boolean isPlayer1;
    int turnVal;

    public PigTheGame(){
        player1 = new PigGamePlayer();
        player2 = new PigGamePlayer();
        scan = new Scanner(System.in);
        isPlayer1 = true;
        turnVal = 0;
    }

    public void start(){
        while (player1.getScore() < 100 && player2.getScore() < 100){
            System.out.println("Player 1's turn:");
            turn(getPlayer());
            ++turnVal;

            System.out.println("Player 2's turn:");
            turn(getPlayer());
            ++turnVal;
        }
        if (player1.getScore() >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins");
        }

    }

    public PigGamePlayer getPlayer(){
        if (turnVal % 2 ==0){
            String message = "1";
            return message + player1;
        }
        else{
            return player2;
        }
    }

    private void turn(PigGamePlayer player){
        player.rollDice();
        score(player);

    }

    private void score(PigGamePlayer player){
        int newScore = 0;

        if (player.getRoll1() == 1 && player.getRoll2() == 1) {
            System.out.println("Yikes! Snake Eyes. Total score reset.");
            newScore = 0;
            System.out.println("Round Score: " + player.getScore());

        }
        else if (player.getRoll1() == 1 || player.getRoll2() == 1){
            System.out.println("Uh oh you rolled a one. Round score reset.");
            newScore = player.getScore();
            System.out.println("Round Score: 0" );

        }
        else {
            newScore = player.getScore() + player.getRoll1() + player.getRoll2();
            System.out.println("Round score:" + newScore);
            player.setScore(newScore);
        }
        if (newScore > player.getScore()) {
            System.out.println("Rolls added to score");
        }

        player.setScore(player.getScore() + newScore);
        System.out.println("Total score:" + player.getScore());
    }
}
