package mystart;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task_1519 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try(DirectoryStream<Path> directoryStream1 = Files.newDirectoryStream(sourceDirectory)){
            for(Path path : directoryStream1){
                if(Files.isRegularFile(path)){
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    Files.copy(path, resolve);

                }else if(Files.isDirectory(path)){
                    continue;
                }
            }
        }
        scanner.close();
    }
}

