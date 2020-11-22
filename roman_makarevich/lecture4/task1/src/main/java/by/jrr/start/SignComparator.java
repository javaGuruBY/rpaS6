package by.jrr.start;

public class SignComparator {

    public String compare(int number) {
        String answer;

        if (number > 0) {
            answer = "Number is positive";
        } else if (number < 0) {
            answer = "Number is negative";
        } else {
            answer = "Number is equal to zero";
        }
        return answer;
    }
}
