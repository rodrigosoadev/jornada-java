package javacore.Cintermediario.Ddatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.of(22, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9, 45, 21);
        System.out.println(localDateTime);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
