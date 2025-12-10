import java.util.Scanner;

public class ifelse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("largest"+a);
        }
        else{
            System.out.println("Largest"+b);
        }
    }
}
