package by.jrr.start;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog(5, "black", "Rokki");

        System.out.println("Dog age = " + dog.age);
        System.out.println("Dog color = " + dog.color);
        System.out.println("Dog name = " + dog.name);

        System.out.println();
        System.out.println("Dog voice = " + dog.isOn);
        System.out.println("Dog eat = " + dog.eaOn);
        System.out.println("Dog sleep = " + dog.slOn);

        System.out.println();
        System.out.println("Dog in sleep!");
        dog.sleepOn();
        System.out.println("Dog sleep = " + dog.slOn);

    }
}
