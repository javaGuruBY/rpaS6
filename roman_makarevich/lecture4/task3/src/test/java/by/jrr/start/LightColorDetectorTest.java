package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    @Test
    public void detectTest1() {
        assertEquals("Violet", lightColorDetector.detect(400));
    }
    @Test
    public void detectTest2() {
        assertEquals("Blue", lightColorDetector.detect(460));
    }
    @Test
    public void detectTest3() {
        assertEquals("Green", lightColorDetector.detect(500));
    }
    @Test
    public void detectTest4() {
        assertEquals("Yellow", lightColorDetector.detect(580));
    }
    @Test
    public void detectTest5() {
        assertEquals("Orange", lightColorDetector.detect(600));
    }
    @Test
    public void detectTest6() {
        assertEquals("Red", lightColorDetector.detect(700));
    }
    @Test
    public void detectTest7() {
        assertEquals("Invisible Light", lightColorDetector.detect(800));
    }
    @Test
    public void detectTest8() {
        assertEquals("Invisible Light", lightColorDetector.detect(100));
    }
}