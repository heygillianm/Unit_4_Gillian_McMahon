public class PigGamePlayer{

    private String rollAgain;
    PigGameDie one;
    PigGameDie two;
    private int score;

    public PigPlayer(String theRollAgain){
        rollAgain = theRollAgain;
        one = new PigGameDie();
        two = new PigGameDie();
        score = 0;
    }

    public int getScore(){
        return score;
    }

    public void addScore(int value){
        score += value;
    }

    // sets score based off of what was rolled
    public int Score(){
        if (one.isOne() && two.isOne()) {
            return score = 0;
        }
        if (one.isOne() || two.isOne()) {
            return score;
        }
        while (one.isOne() && two.isOne()){
            return score;
            one.roll();
            two.roll();

        }
        return score;

    }

    public String toString(){
        System.out.println("Your current score"+ getScore());
    }
}