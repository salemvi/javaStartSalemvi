package javaRush_17lvl;

import java.time.format.DateTimeFormatter;

import static javaRush_17lvl.task_1617.localDateTime;

public class task_1619 {
    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        System.out.println(formatter.format(localDateTime));
    }
}
