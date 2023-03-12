package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferredRW_2 {
    public static void main(String[] args) {
        String outputFile = "test2";
        String[] arrayOut = {"one", "two", "three", "four"};

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
            for(String line : arrayOut){
                writer.write(line + "\n");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
