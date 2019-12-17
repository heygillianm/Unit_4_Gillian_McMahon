public class PigGamePlayer{
    private int score;
    PigGameDie dieOne;
    PigGameDie dieTwo;
    int roll1;
    int roll2;

    public PigGamePlayer(){
        score = 0;
        dieOne = new PigGameDie();
        dieTwo = new PigGameDie();
        roll1 = -1;
        roll2 = -1;
    }

    public int getScore(){
        return score;
    }

    public int setScore(int value){
        score = value;
        return score;
    }
    public void rollDice() {
        roll1 = dieOne.roll();
        roll2 = dieTwo.roll();
        System.out.println("Roll 1: "+ roll1 + "\nRoll 2: "+ roll2);
    }

    public int getRoll1(){
        return roll1;
    }

    public int getRoll2(){
        return roll2;
    }

}
