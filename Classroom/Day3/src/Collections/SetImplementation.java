import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class SetImplementation {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(2);

        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.contains(2));

        st.remove(3);
        System.out.println(st);

        Iterator<Integer> it = st.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        st.clear();
        System.out.println(st);
    }
}

