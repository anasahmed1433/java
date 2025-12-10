import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]);
}

}
}