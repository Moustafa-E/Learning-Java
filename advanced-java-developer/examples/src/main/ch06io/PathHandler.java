package ch06io;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathHandler {

    public static void main(String[] args) {

        Path file1 = Path.of("file1.txt");
        System.out.println(file1.getFileName());
        System.out.println(file1.getNameCount());

        Path file2 = Path.of("c:/labs/sql/createtables.sql");
        System.out.println(file2.getNameCount());
        System.out.println(file2.getName(1));

        Iterable<Path> paths = FileSystems.getDefault().getRootDirectories();
        System.out.println(paths);

    }
}
