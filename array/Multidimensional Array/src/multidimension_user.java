import java.util.Scanner;

public class multidimension_user {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cloms");
        int r= sc.nextInt();
        int c=sc.nextInt();

        int [][]arrays=new int[r][c];
        System.out.println("Enter the array elements");

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arrays[i][j]= sc.nextInt();
            }
        }
        System.out.println("The array elements are");
        for (int i=0;i<r;i++){

            for (int j=0;j<c;j++){
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}

