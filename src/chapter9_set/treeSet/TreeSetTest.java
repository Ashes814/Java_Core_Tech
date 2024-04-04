package chapter9_set.treeSet;
import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Item> parts = new TreeSet<Item>();
        parts.add(new Item("Modem", 9912));
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));

        System.out.println(parts);

        Set<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

    }
}
