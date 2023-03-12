package mystart;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaRush_task1509 {
    public static void main(String[] args) {
        try(InputStream stream = System.in;
            Scanner scanner = new Scanner(stream)){

            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for(char myChar : chars){
                if(Character.isAlphabetic(myChar)){
                    characters.add(Character.toLowerCase(myChar));
                }
            }
            System.out.println(characters);


        }catch (IOException e){
            System.out.println("Something went wrong : ");
            e.printStackTrace();
        }
    }
}
