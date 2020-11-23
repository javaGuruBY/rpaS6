package by.jrr.start;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){

        return Math.PI * (Math.pow(radius, 2));
    }
}
