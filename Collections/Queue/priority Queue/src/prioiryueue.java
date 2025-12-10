import java.util.PriorityQueue;

public class prioiryueue {
    static void main(String[] args) {
        PriorityQueue<String> names=new PriorityQueue<>();
        names.offer("Anas");
        names.offer("Adarsh");
        names.offer("Habeeba");
        names.offer("Azeez");
        names.offer("Kuldeep");
        System.out.println(names);
    names.poll();
        System.out.println(names.poll());
        System.out.println(names.add("Habeeba1"));
        System.out.println(names);
        System.out.println(names.peek());

    }
}
