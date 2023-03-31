package javaRush_17lvl;

import java.time.LocalTime;

public class task_1611 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        if(base.getHour() == 16) return base.plusHours(8);
        return base.plusHours(4);
    }
}
