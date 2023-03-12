package mystart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class JavaRush_task1508 {
    public static void main(String[] args) {

        try (InputStream stream = System.in;
             InputStreamReader input = new InputStreamReader(stream);
             BufferedReader buffer = new BufferedReader(input)) {
            String line = buffer.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] % 2 == 1){
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                }else{
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
