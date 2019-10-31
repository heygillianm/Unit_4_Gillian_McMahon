/*
Creates instances of the Coin class and tests their attributes and behaviors
*/

public class CoinTester{
  public static void main(String [] args){
    Coin myCoin = new Coin(); //goes to coin class

    int i;
    int numHeads = 0;
    final int NUM_FLIPS = 10;
    //initializing variables

    System.out.println("\nFLipping a coin " + NUM_FLIPS + " times:");

    //it will only go ten times as instructed
    for (i = 0; i < NUM_FLIPS; i++){
      myCoin.flip();
      //going into the coin class to flip the Coin
      System.out.print(myCoin + "\t");
      if (myCoin.isHeads()){
        numHeads++; //counting number of times heads occurs
      }
    }
    System.out.println("\n% of heads = " + (numHeads/(double)NUM_FLIPS * 100));
    //getting a percentage of heads
  }
}
