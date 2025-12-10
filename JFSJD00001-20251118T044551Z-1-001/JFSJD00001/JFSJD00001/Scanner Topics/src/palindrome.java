import java.util.Scanner;

public class palindrome {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its a palindrome ");
        int num=sc.nextInt();
        int n=num;
        int reverse=0;
        while (num!=0)
        {
            int a=num%10;
            reverse=reverse*10+a;
            num=num/10;
        }
        if (n==reverse){
            System.out.println("Entered number is a palindrome");
        }
        else {
            System.out.println("The entered number is not a palindrome");
        }
    }
}
