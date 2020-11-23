package by.jrr.start;

public class Stock {

    private String name;
    private double currentPrice;
    private double maxPrice;
    private double minPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public  void updatePrice(double newPrice){
        currentPrice = newPrice;
        if (newPrice < minPrice){
            minPrice = newPrice;
        }
        if (newPrice > maxPrice){
            maxPrice = newPrice;
        }
    }

    public  String printInformation(){
       return "Company = \"" + name + "\", Current Price = " + currentPrice + ", Min Price = "+minPrice+", Max Price = " +maxPrice;
    }
}
