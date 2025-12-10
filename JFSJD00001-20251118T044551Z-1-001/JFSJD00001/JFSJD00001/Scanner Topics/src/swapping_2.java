import java.util.Scanner;
public class swapping_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a and b: a = " + a + ",b= " + b);

    }}