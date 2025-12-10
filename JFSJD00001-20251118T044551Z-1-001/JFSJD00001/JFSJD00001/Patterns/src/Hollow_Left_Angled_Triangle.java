import java.util.Scanner;
public class Hollow_Left_Angled_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) {

                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                if (i == 1 || i == n || k == 1 || k == i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
