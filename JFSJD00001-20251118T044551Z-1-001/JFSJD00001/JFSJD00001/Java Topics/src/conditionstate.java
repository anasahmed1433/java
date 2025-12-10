import java.util.Scanner;

public class conditionstate {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>18){ // checks if the 1st confition is true its breaks the lop and gets the output
            System.out.println("Eligible for the vote");
        }
        else{ // if the if condition is false it execuyes the else condition
            System.out.println("Better try next year");
        }
    }
}
