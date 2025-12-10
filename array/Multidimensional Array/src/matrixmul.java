import java.util.Scanner;

public class matrixmul {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and colms for matrix 1");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] A=new int[r][c];
        System.out.println("Enter the rows and colms for matrix 2");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int [][] B=new int[r1][c1];
        int[][] C=new int[r][c1];
        System.out.println("Enter the elements of 1st ,matrix");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd ,matrix");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of matrix 1 and 2");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                C[i][j]=A[i][j]*B[i][j];
            }
        }
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
