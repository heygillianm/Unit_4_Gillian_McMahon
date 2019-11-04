public class CarTester {
  public static void main(String [] args){
    Car myCar = new Car("Honda", "Fit", 43.0, 10.6);
    Car noahsCar = new Car("Honda", "Civic", 29.0, 10.6);
    Car momsCar = new Car("Porsche", "Macan", 23.0, 19.8);
    //make, model, MPG, tanksize
    //Ask user to choose between three cars: Porsche, Honda, Hyundi

    System.out.println(myCar + "\n");
    System.out.println(noahsCar + "\n");
    System.out.println(momsCar);

    myCar.drive(12.2);
    //how many miles? drive the car x many miles
    //restrictions on how far you can drive
    System.out.println();
    System.out.println("Drove 12.2 miles: " + "\n" + myCar);
    //amount of gas left after x many miles

    myCar.addFuel(10.5); //adding x gallons
    //restrictions on how much fuel to have

    System.out.println();
    System.out.println("Added 10.5 gallons of fuel: " + "\n" + myCar);
    //state of car after adding fuel
  }
}
