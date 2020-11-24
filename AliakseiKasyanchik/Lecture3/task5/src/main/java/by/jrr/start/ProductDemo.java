package by.jrr.start;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product();

        product.name = "Milk";
        product.discount = 20;
        product.regularPrice = 0.80;

        product.printInformation();
    }
}
