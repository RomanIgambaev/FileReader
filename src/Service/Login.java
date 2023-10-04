package Service;

import Entity.List;
import Entity.User;

public class Login {
    private List<User> listUser;

    public Login (List<User> listUser) {
        this.listUser = listUser;
    }

    public User authenticate(String login, String password) {
        for (User user : listUser.getAll()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

