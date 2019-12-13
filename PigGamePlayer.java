public class PigGamePlayer{

    PigGameDie one;
    PigGameDie two;
    private int score;

    public PigGamePlayer(){
        one = new PigGameDie();
        two = new PigGameDie();
        score = 0;
    }

    public int getScore(){
        return score;
    }

    public int addScore(){
        if (one.isOne() && two.isOne()){
            return score = 0;
        }
        if (one.isOne()||two.isOne()){
            return score;
        }
        else{
            return one + two;
        }
    }

    public String toString(){

        System.out.println("Your current score"+ getScore());
    }
}