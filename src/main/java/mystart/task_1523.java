package mystart;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task_1523 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try(OutputStream outputStream = connection.getOutputStream();
        PrintStream reader = new PrintStream(outputStream)){
            reader.println("Привет!");
        }
        try(InputStream inputStream = connection.getInputStream();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream))){
            while(buffer.ready()){
                System.out.println(buffer.readLine());
            }
        }
    }







}
