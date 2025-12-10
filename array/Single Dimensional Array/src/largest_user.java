import java.util.*;
public class largest_user {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println("largest number is="+large);

}
}