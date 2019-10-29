/*
Represents a coin with two sides that can be flipped
It is a blueprint for how to make a coin object
*/

public class Coin
{
  //instance variables, attributes, data declarations
  private int face;

  private final int HEADS = 0; //Constants defining heads and tails
  private final int TAILS = 1;

  /*
  Constructor for objects of class coin
  Sets up coin by flipping it initially
  Defines what happens when a Coin object is made
  */

  public Coin(){
    //why are they both blue? blue means methods. yellow means types
    flip();
  }

  /*
  This is the section of the class containing the methods (behaviors) of a coin
  Flip method assigns a randomly chosen value to the face of the coin
  */
  public void flip(){
    face = (int) (Math.random()*2); //Math.random creates a decimal between 0-1
  }

  /*
  The isHeads method tells us if the coin's face is a heads or not
  Returns true if current face of the coin is heads
  */
  public boolean isHeads(){
    return (face == HEADS);
  }

  /*
  Returns current face of the coin as a string
  */
  public String toString(){
    String faceName;
    if (face == HEADS){
      faceName = "Heads";
    }
    else {
      faceName = "Tails";
    }
    return faceName;
  }
}
