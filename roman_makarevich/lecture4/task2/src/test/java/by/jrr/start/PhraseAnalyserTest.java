package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {

    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    @Test
    public void analyse1() {
        assertEquals("It stands no chance", phraseAnalyser.analyse("Make bla-bla-bla great again"));
    }

    @Test
    public void analyse2() {
        assertEquals("It could be worse", phraseAnalyser.analyse("bla-bla-bla great again"));
    }

    @Test
    public void analyse3() {
        assertEquals("It could be worse", phraseAnalyser.analyse("Make bla-bla-bla"));
    }

    @Test
    public void analyse4() {
        assertEquals("It is fine, really", phraseAnalyser.analyse("bla-bla-bla"));
    }
}