import java.util.Scanner;
public class bitwiseop {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a");
             int a=sc.nextInt();
        System.out.println("Enter the value of b");
             int b=sc.nextInt();
        System.out.println(a&b); // And both shld be true or else false
            System.out.println(a|b); // either one shld be true
                System.out.println(a^b); // OR if both are same false
        System.out.println(~a);// -(a+1)
            System.out.println(a<<2);// shifting to left and use 32 16 8 4 2 1
        System.out.println(a>>2);//shifting to rght and use 8 4 2 1
    }
}
