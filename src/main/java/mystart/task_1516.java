package mystart;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_1516 {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String list = scanner.nextLine();
            if(Files.isRegularFile(Path.of(list))){
                System.out.println(list + THIS_IS_FILE);
            }else if(Files.isDirectory(Path.of(list))){
                System.out.println(list + THIS_IS_DIR);
            }else if(list.isEmpty()){
              break;
            }else{
                break;
            }

        }
    }
}
