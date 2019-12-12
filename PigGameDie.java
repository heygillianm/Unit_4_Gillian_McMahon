public class PigGameDie{
    private int face;

    public PigGameDie (){
        face = 1;
    }

    public void roll(){
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

        boolean isOne = face==1;

        if (face==1){
            return isOne;

        }
        return !isOne;
    }
}