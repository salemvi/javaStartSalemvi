package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Paths_Path_File_Files {
    public static void main(String[] args) throws IOException {
        Stream<String> stream = Files.lines(Paths.get("test1"));

        List<String> result = stream
                .filter(line -> line.startsWith("Hello"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
