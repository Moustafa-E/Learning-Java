package ch06io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectorySearch {

    public static void main(String[] args) {

        Path path = Path.of("c:/labs");

        try {
            Files.walk(path)
                    .filter(f -> f.toString().endsWith(".xml"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
