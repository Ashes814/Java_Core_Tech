package chapter4_OOP;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
//        System.out.println(weekday);
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");

        }

        while (date.getMonthValue() == month) {


            if (date.getDayOfMonth() == today ) {
                System.out.print("*");
            }
            System.out.printf("%2d  ", date.getDayOfMonth());


            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println("");
            }
            date = date.plusDays(1);
        }
    }
}
