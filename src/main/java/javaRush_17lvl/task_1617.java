package javaRush_17lvl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class task_1617 {
    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        //напишите тут ваш код
        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
    }
}
