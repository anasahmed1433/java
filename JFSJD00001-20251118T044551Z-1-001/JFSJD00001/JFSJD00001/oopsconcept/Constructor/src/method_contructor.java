import java.util.Scanner;
class TataStrive{
    String CourseName;String BatchName;String CourseDuration;
    TataStrive(  String Course_Name,String Batch_Name,String Course_Duration){
        CourseName=Course_Name;
        BatchName=BatchName;
        CourseDuration=Course_Duration;
    }
    public void Details(String Address,long PhoneNumber){
        System.out.println("CourseName="+CourseName+"\nBatchName="+BatchName+"\nCourseDuration="+CourseDuration+"\nAddress="+Address+"\nAddress="+PhoneNumber);
    }
}
public class method_contructor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the TataStrive Details");
        String Course_Name=sc.nextLine();
        String Batch_Name=sc.nextLine();
        String Course_Duration=sc.nextLine();
        String Address=sc.nextLine();

        long PhoneNumber=sc.nextLong();

        TataStrive obj=new TataStrive( Course_Name,Batch_Name,Course_Duration);
        obj.Details(Address,PhoneNumber);
}
}