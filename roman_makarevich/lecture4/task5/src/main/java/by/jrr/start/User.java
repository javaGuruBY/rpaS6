package by.jrr.start;

public class User {

    private String login;
    private String password;
    private boolean islocked;
    private int numberOfattemps;

    {
        numberOfattemps = 3;
        islocked = false;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIslocked() {
        return islocked;
    }

    public int getNumberOfattemps() {
        return numberOfattemps;
    }

    public void setNumberOfattemps(int numberOfattemps) {
        this.numberOfattemps = numberOfattemps;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void resetAttemps() {
        numberOfattemps = 3;
    }

    public void userlock() {
        islocked = true;
    }


}
