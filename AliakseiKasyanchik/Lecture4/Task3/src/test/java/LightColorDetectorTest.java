import by.jrr.start.LightColorDetector;
import org.junit.Test;
import static org.junit.Assert.*;

public class LightColorDetectorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();

    @Test
    public void testViolet() {
        assertEquals("Violet", lightColorDetector.detect (443));
    }
    @Test
    public void testBlue() {
        assertEquals("Blue", lightColorDetector.detect (490));
    }
    @Test
    public void testGreen() {
        assertEquals("Green", lightColorDetector.detect (560));
    }
    @Test
    public void testYellow() {
        assertEquals("Yellow", lightColorDetector.detect (570));
    }
    @Test
    public void testOrange() {
        assertEquals("Orange", lightColorDetector.detect (591));
    }
    @Test
    public void testRed() {
        assertEquals("Red", lightColorDetector.detect (700));
    }
    @Test
    public void testInvisibleLight() {
        assertEquals("Invisible Light", lightColorDetector.detect (900));
    }

}
