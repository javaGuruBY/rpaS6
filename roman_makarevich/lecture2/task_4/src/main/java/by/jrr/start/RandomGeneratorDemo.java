package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random random = new Random();

        int max = 100;
        int min = 1;

        int a = random.nextInt(max - min + 1) + min;
        int b = random.nextInt(max - min + 1) + min;
        int c = random.nextInt(max - min + 1) + min;

        int sum = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a+b+c = " + sum);
    }
}
