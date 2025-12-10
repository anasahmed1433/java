import java.util.*;
import java.util.Collections;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> n=new TreeSet<>();
        n.add(23);
        n.add(2);
        n.add(12);
        n.add(45);
        n.add(22);
        n.add(26);
        n.add(42);
        n.add(5);
        System.out.println(n);

        System.out.println(n.contains(2));

        System.out.println(n.ceiling(12));

        System.out.println(n.floor(10));

        System.out.println(n.lower(10));
        System.out.println(n.higher(12));

        n.remove(3);
        System.out.println(n);

        n.clear();
        System.out.println();

        System.out.println(n.isEmpty());
    }
}