package by.jrr.start;

public class UserLoginService {
    boolean login(User user, String password) {
        boolean answer;
        if (!user.isIslocked() && user.getPassword().equals(password)) {
            user.resetAttemps();
            answer = true;
        } else if (user.getNumberOfattemps() == 1) {
            user.userlock();
            answer = false;
        } else {
            user.setNumberOfattemps(user.getNumberOfattemps() - 1);
            answer = false;
        }
        return answer;
    }
}
