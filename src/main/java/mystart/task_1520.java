package mystart;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task_1520 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    Files.move(path, resolve);
                } else if (Files.isDirectory(path)) {
                    continue;

                }
            }
        }
        scanner.close();
    }
}