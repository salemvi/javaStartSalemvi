package mystart;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) { //старт с нуля
    try(Scanner sc = new Scanner(System.in)){
        List<String> lists = Files.readAllLines(Path.of(sc.nextLine()));

        for(String list : lists){
            System.out.println(list.replaceAll("[,.!]", ""));
        }
    }catch (Exception e){
        throw new RuntimeException();
    }

    }
}