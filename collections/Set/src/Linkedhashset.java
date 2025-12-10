import java.util.LinkedHashSet;
import java.util.*;

public class Linkedhashset {
    static void main(String[] args) {
        LinkedHashSet<Integer> n=new LinkedHashSet<>();

        n.add(23);
        n.add(2);
        n.add(12);
        n.add(45);
        System.out.println(n);

        System.out.println(n.contains(2));
        n.iterator();

        n.remove(2);
        System.out.println(n);

        n.clear();
        System.out.println(); 

        System.out.println(n.isEmpty());

    }
}
