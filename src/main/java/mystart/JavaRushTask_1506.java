package mystart;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class JavaRushTask_1506 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){ // вводим число

            List<String> lists = Files.readAllLines(Paths.get(sc.nextLine())); //файл1
            for(String list : lists){ //проходимся по каждому символу в строке
                System.out.println(list.replaceAll("[,!.{}]", "")); //редачим знаки и скобки
            }
        }catch (Exception e){ //обрабатываем исключение
            System.out.println("Ошибка, проверьте путь к файлу");
            e.printStackTrace();
        }
    }
}
