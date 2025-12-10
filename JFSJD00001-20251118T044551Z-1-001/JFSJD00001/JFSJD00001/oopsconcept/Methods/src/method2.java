import java.util.Scanner;

class company{
    public void employee(String emp_name,int emp_salary,String emp_role){
        System.out.println(emp_name+" "+emp_salary+" "+emp_role);
    }
    public void department(String dept_name,int dept_id){
        System.out.println(dept_name+" "+dept_id);
    }
}
public class method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter person details");
        String emp_name=sc.nextLine();
        String emp_role=sc.nextLine();
        int emp_salary=sc.nextInt();
        sc.nextLine();
        System.out.println("enter department details");
        String dept_name=sc.nextLine();
        int dept_id=sc.nextInt();

        company c=new company();
        c.employee(emp_name,emp_salary,emp_role);
        c.department(dept_name,dept_id);

    }
}