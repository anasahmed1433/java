import java.util.Scanner;

public class ifelseifelse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n>0){ // if the satements is true it breaks th loop
            System.out.println("Positive number");
        }
        else if(n<0){ // if the statement is false if executes else if
            System.out.println("Negative number");
        }
        else{ // if both the satements are false its breaks the loop by using else
            System.out.println("Number is zero");
        }
    }
}