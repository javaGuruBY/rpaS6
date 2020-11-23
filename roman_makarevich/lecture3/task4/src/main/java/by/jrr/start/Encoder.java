package by.jrr.start;

public class Encoder {
    void encode(short code){
        char symbol = (char) code;
        System.out.printf("%d =>'%s'\n", code, symbol);
    }

    void decode(char symbol){
        short code = (short) symbol;
        System.out.printf("'%s' => %d\n", symbol,code);
    }
}
