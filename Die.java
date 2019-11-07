public class Die {
    //attributes of Die class
    private int face;

    //constructor
    public Die(){
        face = 1;
    }
    //getter methods
    public int getFace(){
        return face;
    }
    //setter methods
    public void roll(){
        face = (int) (Math.random()*6 + 1);
    }
    public String toString(){
        String result = "Face value = ";
        result += face;
        return result;
    }
}
