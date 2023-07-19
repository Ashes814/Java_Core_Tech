package chapter5_inheritance;

import java.util.ArrayList;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Size size = Enum.valueOf(Size.class, "SMALL");
        System.out.println(size.getAbbreviation());

    }
}
