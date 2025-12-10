import java.util.Scanner;
public class Hollow_Inverted_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++) {
                if (i == n || i == 1 || k == 1 || k == 2 * i - 1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

