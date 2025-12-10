import java.util.Scanner;

public class largestof3number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a");
        int a=sc.nextInt();
        System.out.println("Enter the number b");
        int b=sc.nextInt();
        System.out.println("Enter the number c");
        int c=sc.nextInt();

        if(a>b && a>c){ // if both the & is true its true
            System.out.println("A is greater than b and c");
        }
        else if (b>a && b>c)
        {
            System.out.println("B is greater than A and C");
        }
        else{
            System.out.println("C is greater than A and B");
        }
    }
}
