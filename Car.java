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
  private double MPG; //miles per gallon
  private double tankSize; //in gallons
  private double amtFuel; //in gallons

  /*
  Constructor for the Car. Intializes the instance variables for the car.
  */
  public Car (String carMake, String carModel, double carMPG, double carTankSize){
    make = carMake;
    model = carModel;
    MPG = carMPG;
    tankSize = carTankSize; //really easy to flip things around, DON'T
    amtFuel = tankSize;


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
    return MPG;
  }

  public double getTankSize (){
    return tankSize;
  }

  /*
  Mutator method (setter) for fuel amount
  */
  public void setAmtFuel(double addFuel){
    double gasAmt;
    if (amtFuel + addFuel < tankSize){
      amtFuel += addFuel;
    }
    else {
      System.out.println("You have a full tank. No more fuel.");
    }
  }


public String toString(){
  String result = "";
  result += "Make: " + make + ", Model: " + model + "\n";
  result += "MPG: " + mpg + "Tank Size: " + tankSize + "\n";
  result += "Current amount of fuel: " + amtFuel;
}

  }
}
