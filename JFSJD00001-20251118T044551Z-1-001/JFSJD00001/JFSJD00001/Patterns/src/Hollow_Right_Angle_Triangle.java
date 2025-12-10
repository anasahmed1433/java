import java.util.Scanner;
public class Hollow_Right_Angle_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n||i==j||j==1)
                    System.out.print("  *");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
