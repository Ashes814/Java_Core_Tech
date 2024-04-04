package chapter5_inheritance;

import chapter5_inheritance.class5_7.Employee;

import java.util.ArrayList;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Size size = Enum.valueOf(Size.class, "SMALL");
        System.out.println(size.getAbbreviation());

        Employee e = new Employee("Jack", 100, 2021,2,1);
        Class cl = e.getClass();
        System.out.println(e.getClass().getName() + " | " + e.getName());

    }
}
