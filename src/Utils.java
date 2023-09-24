import java.io.*;

public class Utils {
    static String[] getPartsOfLine(String line) {
        return line.split(",");
    }

    public static void readFile(ListUser listUser, String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] partsOfLine = Utils.getPartsOfLine(line);

                User user = new User(partsOfLine[0], partsOfLine[1]);
                listUser.insertUser(user);
            }

            listUser.printUsers();
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception er) {
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найден");
        }
    }

    public static void writeDataToFile(ListUser listUser, String fileName) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            User[] users = listUser.getUsers();

            for (int i = 0; i < listUser.getSize(); i++) {
                bufferedWriter.write(users[i] + "\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Произошла ошибка при закрытии файла");
            }
        }
    }
}