package ch06io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesHandler {

    public static void main(String[] args) {

        Path file1 = Path.of("file1.txt");
        System.out.println(Files.exists(file1));
        System.out.println(Files.isWritable(file1));

        Path file2 = Path.of("file2.txt");
        if (Files.exists(file1)) {
            try {
                Files.move(file1, file2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            Files.deleteIfExists(file2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
