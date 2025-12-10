import java.util.*;
public class collection1 {
    public static void main(String[] args) {
        Collection<String>names=new ArrayList<>();
        names.add("Adarsh");
        names.add("Anas");
        names.add("Balaji");
        names.add("yeswanth");
        System.out.println(names);
        names.remove("Anas");
        System.out.println(names);
}
}