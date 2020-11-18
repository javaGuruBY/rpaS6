package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void login() {
        User user = new User();
        String password = "1234";
        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;

        boolean actual = userLoginService.login(user, password);

        Assert.assertEquals(expected, actual);
    }
}
