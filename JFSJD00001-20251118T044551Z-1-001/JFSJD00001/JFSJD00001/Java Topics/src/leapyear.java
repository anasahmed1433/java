import java.util.Scanner;

public class leapyear {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check leap year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
    }
}
