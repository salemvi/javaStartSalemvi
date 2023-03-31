package javaRush_17lvl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;


public class task_1612 {
    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Set<LocalDateTime> sett = new HashSet<>();
        for(var dateTime : sourceMap.entrySet()){
            for (int i = 0; i < dateTime.getValue().size(); i++) {
                LocalTime time = dateTime.getValue().get(i);
                LocalDate date = dateTime.getKey();

                sett.add(LocalDateTime.of(date, time));
            }
        }
        return sett;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}

