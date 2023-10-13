package sportshop.bootstrap.entity;

import java.io.Serializable;

public class User implements Serializable {

    protected String fullName;
    protected String login;
    protected String password;
    protected transient int age;
    protected char sex;

    public User(String fullName, String login, String password, int age, char sex) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }
    public void updateData(String fullName, String login,String password, int age, char sex) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Пользователь с именем %s, логином %s, паролем %s,возрастом %d, полом %c", fullName, login, password,age,sex);
    }
}
