import java.io.Serializable;

public class User implements Serializable {
    public static String userLogin;
    public static String userPassword;

    public User(String userLogin, String userPassword) {
        User.userLogin = userLogin;
        User.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return String.format(userLogin + userPassword);
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        User.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        User.userPassword = userPassword;
    }
}
