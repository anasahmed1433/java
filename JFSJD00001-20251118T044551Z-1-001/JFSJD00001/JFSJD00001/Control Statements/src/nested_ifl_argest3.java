import java.util.Scanner;

public class nested_ifl_argest3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        System.out.println("Enter the number c");
        int c = sc.nextInt();

        if(a>b){
            if(a>b){
                System.out.println("A is largest");
            }
            else{
                System.out.println("b is largest");
            }
        } else if (b>a) {
            if(b>a){
                System.out.println("B is greater");
        }
            else {
                System.out.println("C is greater");
            }
    }
        else{
            System.out.println("C is greater than A and B");
        }
    }
}
