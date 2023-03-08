package mystart;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaRushTask_1504 { //Программа принимает на вход 2 файла и меняет содержимое местами побайтово
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in); // открываем сканнер и принимаем 2 пути к файлам из консоли
             InputStream input = Files.newInputStream(Paths.get(sc.nextLine()));
             OutputStream output = Files.newOutputStream(Paths.get(sc.nextLine()))) {
            byte[] bytesIn = input.readAllBytes(); // считываем все байты из 1 файла
            byte[] bytesOut = new byte[bytesIn.length]; // задаем длину
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) { // для того, чтобы последний байт не менять местами
                    bytesOut[i] = bytesIn[i + 1]; // 1 байт меняем местами на 2
                    bytesOut[i + 1] = bytesIn[i]; // 2 байт меняем местами на 1
                } else {
                    bytesOut[i] = bytesIn[i]; // последний байт остается неизменным
                }
                output.write(bytesOut); // записываем все во 2 файл
            }
        } catch (IOException e) { // обрабатываем исключение
            System.out.println("Что-то пошло не так");
            e.printStackTrace(); // отслеживаем ошибку
        }
    }
}
