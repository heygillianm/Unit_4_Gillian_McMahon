public class PigGameDie{
    private int face;

    public PigGameDie (){
        face = 1;
    }

    public int roll() {
        face = (int) (Math.random() *6 +1);
        return face;
    }

    public int getFace(){
        return face;
    }
}
