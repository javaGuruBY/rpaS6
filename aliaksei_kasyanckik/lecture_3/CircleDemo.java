package home;

public class CircleDemo {
	public static void main(String[] args) {
		
		 Circle circle = new Circle();
		 
		 circle.radius = 2.35;
		 double p1 = circle.calculateArea();
		 System.out.println("Area cirkle side radius is " + circle.radius + " = " + p1);
		 
		 circle.radius = 7.16;
		 double radius2 = circle.calculateArea();
		 System.out.println("Area cirkle side radius is " + circle.radius + " = " + radius2);
		 }

}
