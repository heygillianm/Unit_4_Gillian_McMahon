/*
Car class stores following properties and behaviors:
- make of Car (Toytoa, Ford, BMW, etc)
- model of Car (Highlander, Fiesta, M3, etc)
- fuel efficiency (miles/gallon)
- amount of Fuel (in gallons)
- driving a Car
- fuel to tank
*/

public class Car {
  /*
  The attributes of a car (instance variables)
  */
  private String make;
  private String model;
  private double mpg; //miles per gallon
  private double tankSize; //in gallons
  private double amtFuel; //in gallons

  /*
  Constructor for the Car. Intializes the instance variables for the car.
  */
  public Car (String carMake, String carModel, double carMPG, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carMPG;
    tankSize = carTankSize; //really easy to flip things around, DON'T
    amtFuel = tankSize;
  }

  /*
  Accessor methods (getters) for make, model, MPG, and tank size of Car
  */
  public String getMake (){
    return make;
  }

  public String getModel (){
    return model;
  }

  public double getMPG (){
    return mpg;
  }

  public double getTankSize (){
    return tankSize;
  }

  /*
  Mutator method (setter) for fuel amount
  */
  public void addFuel(double setFuel){
    if (amtFuel + setFuel <= tankSize){
      amtFuel += setFuel;
    }
    else {
      double fuelAdded = tankSize - amtFuel;
      amtFuel = tankSize;
      System.out.println("You added " + fuelAdded + " gallons.");
      System.out.println("You now have a full tank of gas.");
    }
  }

  public void drive(double miles) {
    if (miles <= mpg*amtFuel) {
      amtFuel -= miles/mpg;
    }
    else {
      amtFuel = 0;
      double milesDriven = mpg*amtFuel;
      System.out.println("You drove " + milesDriven + " before you ran out.");
    }
  }

  public String toString(){
    String result = "";
    result += "    Make: " + make + ", Model: " + model + "\n";
    result += "    MPG: " + mpg + ", Tank Size: " + tankSize + "\n";
    result += "    Current amount of fuel: " + amtFuel;
    return result;
  }
}
