import Entity.*;
import Service.Login;
import Utils.FileUtils;

import java.util.Scanner;

public class Website {

    static final List<User> users = new List<>(new User[10]);
    static final Scanner scanner = new Scanner(System.in);
    static final Login loginService = new Login(users);

    public static void runWebsite() {
        FileUtils.readFileUsers(users, "src/UserList.csv");

        System.out.println("Добро пожаловать в интернет магазин спортивных товаров");
        System.out.println("Введите ваш логин и пароль:");

        User authenticatedUser = tryToAuthenticateUser();
        User user = authenticatedUser;

        System.out.println("Авторизация прошла успешно. Добро пожаловать, " + user.getFullName() + "!");
        Menu.printMenu();
        int operation = scanner.nextInt();
        switch (operation){

            case 1 -> System.out.println(user);
            case 2 -> {
                System.out.print("""
                                Введите через ентер следующие поля :
                                1. ФИО
                                2. Логин
                                3. Пароль
                                4. Возраст
                                5. Пол
                                """);
                scanner.nextLine();
                String fullName = scanner.nextLine();
                String login = scanner.nextLine();
                String password = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                char sex = scanner.nextLine().charAt(0);
                authenticatedUser.updateData(fullName,login,password,age,sex);

                users.replaceElement(user,authenticatedUser);
            }
        }

    }

    private static User tryToAuthenticateUser() {
        String userLogin;
        String password;

        System.out.print("Логин: ");
        userLogin = scanner.nextLine();
        System.out.print("Пароль: ");
        password = scanner.nextLine();

        User authenticatedUser = loginService.authenticate(userLogin, password);

        if (authenticatedUser == null) {
            System.out.println("Ошибка аутентификации. Неверный логин или пароль.");
            System.exit(1);
        }

        return authenticatedUser;
    }
}