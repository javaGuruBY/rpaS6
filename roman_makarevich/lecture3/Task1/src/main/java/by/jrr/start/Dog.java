package by.jrr.start;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice(){
        System.out.println("Gav-Gav");
    }

    public void eat(){
        System.out.println("Yum-Yam");
    }

    public void sleep(){
        System.out.println("Z-z-z-z-z");
    }


}
