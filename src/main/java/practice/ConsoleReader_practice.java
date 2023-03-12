package practice;

import java.io.*;

public class ConsoleReader_practice {
    public static void main(String[] args) {
        String outputFile = "test2";

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            try(BufferedWriter writter = new BufferedWriter(new FileWriter(outputFile))){
                String line;
                while(!(line = reader.readLine()).equals("exit")){
                    writter.write(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
