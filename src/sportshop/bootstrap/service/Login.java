package sportshop.bootstrap.service;

import sportshop.bootstrap.entity.List;
import sportshop.bootstrap.entity.User;

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

