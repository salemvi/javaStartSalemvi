package mystart;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class task_1522 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        System.out.println(new String(buffer));
    }

}