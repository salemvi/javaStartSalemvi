package javaRush_17lvl;

import java.time.LocalDate;
import java.util.Locale;

public class task_1607 {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate today = LocalDate.now();

        return today;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate when = LocalDate.of(2020, 9, 12);
        return when;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        int whenOf = ofExample().getDayOfYear();
        return LocalDate.ofYearDay(2020, whenOf);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        long whenEpoch = ofExample().toEpochDay();
        return LocalDate.ofEpochDay(whenEpoch);
    }
}
