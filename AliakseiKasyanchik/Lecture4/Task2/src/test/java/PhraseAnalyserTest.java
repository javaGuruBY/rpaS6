import by.jrr.start.PhraseAnalyser;
import org.junit.Test;
import static org.junit.Assert.*;
public class PhraseAnalyserTest {
    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
@Test
    public void test1() {
        assertEquals("It stands no chance", phraseAnalyser.analyse ("Make oooooooooooo great again"));
    }
    @Test
    public void test2() {
        assertEquals("It could be worse", phraseAnalyser.analyse ("Make oooooooooooo great"));
    }
    @Test
    public void test3() {
        assertEquals("It could be worse", phraseAnalyser.analyse ("Side oooooooooooo great again"));
    }
    @Test
    public void test4() {
        assertEquals("It is fine, really", phraseAnalyser.analyse ("Oooooooooooo again"));
    }
}
