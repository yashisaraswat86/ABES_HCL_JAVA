
package Collections;

import java.util.List;
import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Mango");
        list.add("Leeche");
        list.add("Guava");
        list.add("Orange");
        list.add("Banana");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        int index = list.indexOf("Leeche");

        if (index != -1) {
            list.add(index + 1, "Grapes");
        }

        for (String x : list) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println(list.get(3));
        System.out.println(list.indexOf("Banana"));
    }
}
