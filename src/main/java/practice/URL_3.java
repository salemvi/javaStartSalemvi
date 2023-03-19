package practice;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URL_3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try(OutputStream outputStream = connection.getOutputStream();
            PrintStream print = new PrintStream(outputStream)){
            print.println("Я внутри вашего API!!!!!!!");
        }
        try(InputStream inputStream = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            while (bufferedReader.ready()){
                String str = bufferedReader.readLine().toString();
                System.out.println(str);
            }
        }
    }
}
