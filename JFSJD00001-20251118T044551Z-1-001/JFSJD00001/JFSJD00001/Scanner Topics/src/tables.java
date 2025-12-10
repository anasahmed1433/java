import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        for (i=1; i<= 10;i++)
            System.out.println(n + " * " + i + " = " + (n * i));
    }
}

