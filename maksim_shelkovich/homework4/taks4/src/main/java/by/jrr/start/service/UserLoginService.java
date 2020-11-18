package by.jrr.start.service;

import by.jrr.start.bean.User;

public class UserLoginService {

    public boolean login(User user, String password) {
        boolean Result;
        if (user.password == password) {
            Result = false;
        } else {
            Result = true;
        }
        return true;
    }
}
