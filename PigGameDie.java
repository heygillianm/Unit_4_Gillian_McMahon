public class PigGameDie{
    private int face;

    public PigGameDie (){
        face = 1;
    }

    public int roll()
    {
        face = (int) (Math.random() *6 +1);
    }

    public int getFace(){
        return face;
    }

    public String toString() {
        String result = "The face: ";
        result += face;
        return result;
    }

    public boolean isOne() {
        if (face == 1){
            return true;
        }
        else {
            return false;
        }
    }
}