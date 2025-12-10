import java.util.Scanner;

public class logicalop {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("A && B: " + (a>2&&b>2)); //and gate
        System.out.println("A || B: " + (a>2 || b>2)); // OR Gate
        System.out.println("a&&b"+ (!(a>2 &&b>2))); // not gate
    }
}
