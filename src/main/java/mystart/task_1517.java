package mystart;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task_1517 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path file1 = Path.of(scanner.nextLine());
        Path file2 = Path.of(scanner.nextLine());

        if(Files.notExists(file1)){
            Files.createFile(file1);
        }else if(Files.exists(file1) && Files.notExists(file2)) {
            Files.move(file1, file2);
        }else if(Files.exists(file2)){
            Files.delete(file1);
        }
    }
}
