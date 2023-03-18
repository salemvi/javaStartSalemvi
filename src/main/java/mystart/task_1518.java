package mystart;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.Files.isDirectory;

public class task_1518 {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)){
            for(Path path : directoryStream){
                if(Files.isDirectory(path)){
                    System.out.println(path + THIS_IS_DIR);
                }else if(Files.isRegularFile(path)){
                    System.out.println(path + THIS_IS_FILE);
                }
            }
        }
        scanner.close();
    }
}

