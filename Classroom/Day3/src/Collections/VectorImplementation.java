package Collections;

import java.util.Vector;

public class VectorImplementation {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Mango");
        vector.add("Litchi");
        vector.add("Guava");
        vector.add("Orange");
        vector.add("Banana");

        System.out.println(vector);

        System.out.println(vector.size());
        System.out.println(vector.isEmpty());

        System.out.println(vector.get(0));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.set(1, "Grapes");
        System.out.println(vector);

        vector.remove("Guava");
        vector.remove(0);
        System.out.println(vector);

        System.out.println(vector.contains("Mango"));
        System.out.println(vector.indexOf("Orange"));

        System.out.println(vector.capacity());

        for (String fruit : vector) {
            System.out.println(fruit);
        }

        vector.clear();
        System.out.println(vector);
        System.out.println(vector.isEmpty());
    }
}

