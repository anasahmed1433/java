import java.util.Stack;

public class stack1 {
    static void main(String[] args) {
        Stack<Integer> number=new Stack<>();
        number.push(5);
        number.push(4);
        number.push(6);
        number.push(5);
        number.push(4);
        number.push(6);
        number.push(5);
        number.push(4);
        number.push(6);
        number.push(5);
        number.push(4);
        number.push(5);
        number.push(4);
        number.push(6);
        number.push(6);
        System.out.println(number);
        number.pop();
        System.out.println(number);
        System.out.println(number.isEmpty());
        System.out.println(number.capacity());
        System.out.println(number.iterator());
    }
}
