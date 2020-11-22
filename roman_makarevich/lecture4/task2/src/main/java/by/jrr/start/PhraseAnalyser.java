package by.jrr.start;

public class PhraseAnalyser {


    public String analyse(String text) {
        String answer;

        if (text.startsWith("Make") && text.endsWith("great again")) {
            answer = "It stands no chance";
        } else if (text.startsWith("Make") || text.endsWith("great again")) {
            answer = "It could be worse";
        } else {
            answer = "It is fine, really";
        }
        return answer;
    }
}
