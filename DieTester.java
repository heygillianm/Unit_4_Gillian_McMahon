public class DieTester {
    public static void main(String [] args){
        Die firstDice = new Die();
        Die secondDice = new Die();
        int numRolls = 0;

        System.out.println("Welcome to the die simulator!");

        firstDice.roll();
        secondDice.roll();
        numRolls++;
        System.out.println("Die 1 = " + firstDice.getFace());
        System.out.println("Die 2 = " + secondDice.getFace());
        System.out.println("Sum of two die = " + (firstDice.getFace() + secondDice.getFace()));
        System.out.println();

            while (firstDice.getFace() != secondDice.getFace()) {
                firstDice.roll();
                secondDice.roll();
                numRolls++;
                System.out.println("Die 1 = " + firstDice.getFace());
                System.out.println("Die 2 = " + secondDice.getFace());
                System.out.println("Sum of two die = " + (firstDice.getFace() + secondDice.getFace()));
                System.out.println();

            }
        System.out.println("Roll dice " + numRolls + " times before getting doubles");
        }
    }
