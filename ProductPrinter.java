public class ProductPrinter {
    public static void main(String[] args) {
        Product product1 = new Product("Jason Dandruff Shampoo ", 14.17);
        Product product2 = new Product("Function of Beauty Conditioner ", 29.00);

        System.out.println(product1);
        System.out.println("Intial price " + product2);

        System.out.println();
        product1.reducePrice(0.85);
        product2.reducePrice(0.85);

        System.out.println(product1);
        System.out.println("Reduced price " + product2);
    }
}
