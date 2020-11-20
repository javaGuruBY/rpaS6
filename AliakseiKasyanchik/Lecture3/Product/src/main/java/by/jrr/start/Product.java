package by.jrr.start;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    public double actualPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        return regularPrice;
    }

    public void printInformation() {
        System.out.println("Product : name = " + name + ", regular price = " + regularPrice + " EUR,");
        System.out.println("discount = " + discount + "%, actual price = " + (regularPrice - (regularPrice*discount/100)) + "EUR.");

    }
}
