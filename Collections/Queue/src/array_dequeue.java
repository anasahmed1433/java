import java.util.ArrayDeque;

public class array_dequeue {
    static void main(String[] args) {
        ArrayDeque<Integer> number=new ArrayDeque<>();
        number.offer(5);
        number.offer(7);
        number.offer(9);
        number.offer(2);
        System.out.println(number);

        number.poll();

        System.out.println(number);

        System.out.println(number.peek());

        number.push(4);
        System.out.println(number);

        number.addLast(3);
        number.addFirst(1);
        System.out.println(number);

        System.out.println(number.size());

        System.out.println(number.contains(8));

    }
}
