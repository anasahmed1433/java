import java.util.Scanner;

public class scanneruser1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Name is "+name +" "+"and the age is " +age);
    }
}
