package practice;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class URL_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream input = url.openStream();
        byte[] byteURL = input.readAllBytes();
        Path pathTemp = Files.createTempFile(null, null);
        Files.write(pathTemp, byteURL);
        System.out.println(pathTemp.getRoot().getFileName());
    }
}
