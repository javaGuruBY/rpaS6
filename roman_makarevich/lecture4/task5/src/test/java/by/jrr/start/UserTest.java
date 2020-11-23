package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user = new User("rm@jg", "1111");

    @Test
    public void resetAttemps() {
        user.setNumberOfattemps(2);
        user.resetAttemps();
        assertEquals(3, user.getNumberOfattemps());
    }

    @Test
    public void userlock() {
        user.userlock();
        assertEquals(true, user.isIslocked());
    }
}