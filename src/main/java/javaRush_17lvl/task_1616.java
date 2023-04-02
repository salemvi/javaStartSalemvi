package javaRush_17lvl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;
import java.util.TreeSet;

public class task_1616 {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
        TreeSet<String> allTimeZones = new TreeSet<>();
        for (String timeZone : ZoneId.getAvailableZoneIds()) {
            allTimeZones.add(timeZone);


        }
        return allTimeZones;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);


        return dateTime;
    }
}
