package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practiceBufferedRW {
    public static void main(String[] args) {
        String input = "test1";

        try(BufferedReader reader = new BufferedReader(new FileReader(input))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line + "\n");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
