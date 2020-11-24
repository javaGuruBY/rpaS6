package by.jrr.start;

public class PhraseAnalyser {
    public String analyse(String text) {
        String task;
        if(text.startsWith("Make") && text.endsWith("great again")){
            task = "It stands no chance";
        }else if (text.startsWith("Make") || text.endsWith("great again")){
            task = "It could be worse";
        }else {
            task = "It is fine, really";
        }return task;
    }
}
