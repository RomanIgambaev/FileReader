package sportshop.bootstrap.utils;

import sportshop.bootstrap.entity.List;

import java.io.*;


public class FileUtils {
    public static <T extends Serializable> List<T> readFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Object object = objectIn.readObject();
            return (List<T>) object;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T extends Serializable> void writeDataToFile(List<T> list, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}