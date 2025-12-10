import java.util.Scanner;

public class ternaryop {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int r=(a>b)?a:b;// used as a if else statement (if the 2st condition is true its execute first after the ?, if its false it execute the last condition)
        System.out.println(r);
    }
}
