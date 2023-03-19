package practice;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class URL_2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com/api/1.0/rest/projects");
        InputStream input = url.openStream();
        byte[] bytesIn = input.readAllBytes();
        String str = new String(bytesIn);
        System.out.println(str);


    }
}
