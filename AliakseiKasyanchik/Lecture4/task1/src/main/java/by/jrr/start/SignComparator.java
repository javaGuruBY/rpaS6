package by.jrr.start;

public class SignComparator {
    public String compare(int number) {
        String task;
        if(number>0){
            task = "Number is positive";
        }else if (number<0){
            task = "Number is negative";
        }else {
            task = "Number is equal to zero";
        }return task;
    }
}
