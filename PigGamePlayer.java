public class PigGamePlayer{
    private int score;
    PigGameDie one;
    PigGameDie two;

    public PigGamePlayer(){
        score = 0;
        one = new PigGameDie();
        two = new PigGameDie();
    }

    public int getScore(){
        return score;
    }

    public int setScore(int value){
        score = value;
        return score;
    }

}
