public class PigGameDie{
    private int face;
    private boolean one;

    public PigGameDie (){
        face = 1;
        one = true;
    }

    public int roll() {
        face = (int) (Math.random() *6 +1);
        return face;
    }

    public int getFace(){
        return face;
    }

    public String toString() {
        String result = "The face: ";
        result += face;
        return result;
    }
}
