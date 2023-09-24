import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListUser listUser = new ListUser();

        Utils.readFile(listUser, "src/UserList.csv");

        System.out.println("Запишите логин");
        String login = scanner.nextLine();
        User.userLogin = login;

        System.out.println("Запишите пароль");
        String password = scanner.nextLine();

        User User = new User(login, password);

        System.out.println(User);
    }
}