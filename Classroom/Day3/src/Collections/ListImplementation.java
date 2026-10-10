package Collections;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection ;

public class ListImplementation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(8,10);
        list.remove(5);
        for(int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(list.get(7));
        System.out.println(list.indexOf(4));
        Collections.sort(list);
        System.out.println(list);
    }
}
