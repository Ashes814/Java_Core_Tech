package chapter3_Basic;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 欧欧
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        LocalDate newYearEve = LocalDate.now();
        System.out.println(newYearEve.getYear());
        Date date = new Date();
        System.out.println(date.getYear());


    }
}
