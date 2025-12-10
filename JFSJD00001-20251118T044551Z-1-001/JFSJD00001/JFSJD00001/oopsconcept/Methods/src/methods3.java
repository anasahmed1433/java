import java.util.Scanner;
class Arthimetic{
    public void All(int A,int B){
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
    }
}
public class methods3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A&B");
        int A=sc.nextInt();
        int B=sc.nextInt();
        Arthimetic a=new Arthimetic();
        a.All(A,B);
    }
}