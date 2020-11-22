package by.jrr.start;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog(3, "black", "Butch");

        myDog.voice();
        myDog.eat();
        myDog.sleep();
    }
}
