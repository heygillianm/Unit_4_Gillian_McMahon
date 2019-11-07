public class Product {
    private String name;
    private double price;

    public Product(String proName, double proPrice){
        name = proName;
        price = proPrice;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public void reducePrice(double r){
        price = (price*r);

    }
    public String toString(){
        String result = "";
        result += name;
        result += price;
        return result;
    }
}
