public class CarTester {
  public static void main(String [] args){
    Car myCar = new Car("Honda", "Fit", 43.0, 10.6);
    //make, model, MPG, tanksize
    //Ask user to choose between three cars: Porsche, Honda, Hyundi

    System.out.println(myCar);

    myCar.drive(12.2);
    //how many miles? drive the car x many miles
    //restrictions on how far you can drive

    System.out.println("Drove 12.2 miles: " + myCar);
    //amount of gas left after x many miles

    myCar.addFuel(); //adding x gallons
    //restrictions on how much fuel to have

    System.out.println("Added 10.5 gallons of fuel: " + myCar);
    //state of car after adding fuel
  }
}
