import java.util.Scanner;
public class swap_without_3rdvar {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping a and b is: a = " + a + ",b= "+b );
        }

}
