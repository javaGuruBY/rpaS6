import by.jrr.start.SignComparator;
import org.junit.Test;
import static org.junit.Assert.*;

public class SignComparatorTest {
    SignComparator signComparator = new SignComparator();


    @Test
    public void isPositive() {
        assertEquals("Number is positive", signComparator.compare(3));
    }
    @Test
    public void isNegative(){
        assertEquals("Number is negative", signComparator.compare(-9));
}
    @Test
    public void isZero(){
        assertEquals("Number is equal to zero", signComparator.compare(0));
    }

}
