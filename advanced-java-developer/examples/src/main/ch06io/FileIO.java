package ch06io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO {

    public static void main(String[] args) {

        String fileName = "io-data.txt";
        Path path = Path.of(fileName);
        String[] phrases = {"Hello", "How are you?", "Goodbye"};

        // try-with-resources can be used on any class that implements the AutoClosable interface
        // resources opened inside the parentheses are automatically closed by the JVM
        // this happens whether an exception is thrown or not
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String phrase : phrases) {
                writer.write(phrase + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
