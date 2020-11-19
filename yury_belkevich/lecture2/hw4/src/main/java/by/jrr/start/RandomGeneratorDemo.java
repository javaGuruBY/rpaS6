package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        int firstRandomNumber = new Random().nextInt(1000000);
        int secondRandomNumber = new Random().nextInt(2000000);
        int thirdRandomNumber = new Random().nextInt(3000000);
        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);
        System.out.println(firstRandomNumber + secondRandomNumber + thirdRandomNumber);
    }
}
