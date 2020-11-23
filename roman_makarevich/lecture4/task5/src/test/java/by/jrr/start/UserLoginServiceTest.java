package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {
    User user = new User("rm@jg", "1111");
    UserLoginService userLoginService = new UserLoginService();

    @Test
    public void login1() {
        assertEquals(true, userLoginService.login(user, "1111"));
    }

    @Test
    public void login2() {
        assertEquals(false, userLoginService.login(user, "2222"));
    }

    @Test
    public void login3() {
        userLoginService.login(user, "2222");
        userLoginService.login(user, "3333");
        assertEquals(false, userLoginService.login(user, "2222"));
    }


    @Test
    public void login4() {
        userLoginService.login(user, "2222");
        userLoginService.login(user, "3333");
        userLoginService.login(user, "4444");
        assertEquals(false, userLoginService.login(user, "1111"));
    }
}