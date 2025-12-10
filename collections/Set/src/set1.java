import java.util.HashSet;
import java.util.Set;

public class set1 {
    static void main(String[] args) {
        Set<Integer> n= new HashSet<>();
        n.add(3);
        n.add(4);
        n.add(22);
        n.add(12);
        System.out.println(n);

        System.out.println(n.contains(4));

        System.out.println(n.isEmpty());

        n.clear();
        System.out.println();

        n.iterator();
        System.out.println(n);
    }
}
