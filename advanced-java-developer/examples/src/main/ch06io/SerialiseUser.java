package ch06io;

import java.io.*;

public class SerialiseUser {

    public static void main(String[] args) {

        String fileName = "user.txt";
        User user = new User("Fred", "secret");
        System.out.println("Details entered");
        System.out.println(user);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(user);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            user = (User) inputStream.readObject();
            System.out.println("Details retrieved");
            System.out.println(user);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
