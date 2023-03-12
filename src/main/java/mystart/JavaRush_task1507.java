package mystart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.List;

public class JavaRush_task1507 {
    public static void main(String[] args) throws IOException{
        try(Scanner sc = new Scanner(System.in)){
            List<String> lists= Files.readAllLines(Path.of(sc.nextLine()));
            for (int i = 0; i < lists.size(); i+=2) {
                System.out.println(lists.get(i));
            }


        }catch (IOException e){
            throw new IOException();
        }
        
    }
}

