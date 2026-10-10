package Map;

import java.util.HashMap;

public class HashMapImplementation {
    public static void main(String[] args){
        HashMap<Integer,String> mp  = new HashMap<>();
        mp.put(1,"Apple");
        mp.put(2,"Banana");
        mp.put(3,"Leeche");
        mp.put(4,"Orange");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsValue("Orange"));
        mp.put(5,"Grapes");
        System.out.println(mp);
        System.out.println(mp.containsKey(8));
    }
}
