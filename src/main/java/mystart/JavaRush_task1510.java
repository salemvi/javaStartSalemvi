package mystart;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class JavaRush_task1510 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)){
            Files.write(Path.of(scanner.nextLine()), bytes);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


