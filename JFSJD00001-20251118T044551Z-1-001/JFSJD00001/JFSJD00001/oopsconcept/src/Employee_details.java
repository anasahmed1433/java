class employee{
    String Emp_name="AdarshNaidu";
    int Emp_id=12345;
    int Emp_salary=80000;
}
class department {
    int Dept_id=12345;
    String Dep_name="software";
}
public class Employee_details {
    public static void main(String[] args) {
        employee e=new employee();
        department d=new department();
        System.out.println("Emp_name:"+e.Emp_name+"\nEmp_id:"+e.Emp_id+"\nEmp_salary:"+e.Emp_salary);
        System.out.println("\n\nDept_id"+d.Dept_id+"\nDep_name:"+d.Dep_name);
}
}