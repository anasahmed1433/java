import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int n = num;
        int r = 0;

        while (num != 0) {
            int a = num % 10;
            r = r + (a * a * a); // cube each digit and add
            num = num / 10;
        }

        if (n == r) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

    }
}
