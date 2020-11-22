package by.jrr.start;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.printf("Hi! My name is %s, I'm %d years old!", name, age);
    }
}
