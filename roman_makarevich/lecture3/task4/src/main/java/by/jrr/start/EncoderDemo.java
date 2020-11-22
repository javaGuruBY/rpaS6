package by.jrr.start;

public class EncoderDemo {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        encoder.encode((short) 100);
        encoder.decode('s');

    }
}
