package javaRush_17lvl;
import java.util.Locale;
import java.util.Date;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class task_1601 {
    static Date birthDate = new Date(101, 1, 7);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        Locale local = new Locale("ru", "RU");
        SimpleDateFormat format = new SimpleDateFormat("EEEE", local);
        String messageFormat = format.format(date);
        return messageFormat;
    }
}

