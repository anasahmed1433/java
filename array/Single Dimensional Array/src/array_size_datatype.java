import java.util.Scanner;

public class array_size_datatype {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elemnts are");

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
