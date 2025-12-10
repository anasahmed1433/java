import java.util.Scanner;
public class Hollow_Inverted_Left_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                if (i == n || i == 1 || k == 1 || k == i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
