import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int a = (int) Math.random()*12;
        int b= randomGenerator.nextInt(11);
        int c = (int) Math.random()*12+2;
        System.out.println("a = " + a + ";b = "+ b + ";c = " + c + ";" );

        System.out.println("a + b + c = "+ (a+b+c));
    }
}
