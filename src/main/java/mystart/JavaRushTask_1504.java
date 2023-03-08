package mystart;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaRushTask_1504 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             InputStream input = Files.newInputStream(Paths.get(sc.nextLine()));
             OutputStream output = Files.newOutputStream(Paths.get(sc.nextLine()))) {
            byte[] bytesIn = input.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
                output.write(bytesOut);
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
            e.printStackTrace();
        }
    }
}
