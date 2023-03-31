package javaRush_17lvl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;

import java.util.Locale;

public class task_1608 {
    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        Locale localeRus = new Locale("ru", "RU");
        return dayOfWeek.getDisplayName(TextStyle.FULL, localeRus);
    }
}

