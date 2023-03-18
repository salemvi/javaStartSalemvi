package mystart;

import java.nio.file.Path;
import java.util.Scanner;

public class task_1515 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        if(Path.of(str).isAbsolute()){
            System.out.println(str);
        }else{
            System.out.println(Path.of(str).toAbsolutePath());
        }
    }
}

