package ch06io;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class FileHandler {

    public static void main(String[] args) throws IOException {

        File file1 = new File("file1.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        System.out.println(file1.getName());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.canExecute());
        System.out.println(new Date(file1.lastModified()));

        File file2 = new File("c:/labs");
        if (file2.isDirectory()) {
            System.out.println("Files in directory");
            for (File dirFile : Objects.requireNonNull(file2.listFiles())) {
                System.out.println(dirFile.getName());
            }
        }

    }

}
