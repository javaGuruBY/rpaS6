package by.jrr.start;

public class Product {
    private String name;
    private double regularPrice;
    private int discount;

    public Product(String name) {
        this.name = name;
        regularPrice = 50.0;
        discount = 20;
    }

    public double actualPrice() {
        return regularPrice * ((100 - (double) discount) / 100);
    }

    public void printInformation() {
        System.out.printf("Product : name = \"%s\", regular price = %.2f EUR, discount = %d" + '%' + "%, actual price = %.2f EUR", name, regularPrice, discount, actualPrice());
    }
}
