class person{
    String name1;int age1;String rollno1;String branch1;
    person(String name2,int age,String rollno,String branch){
        name1=name2;
        age1=age;
        rollno1=rollno;
        branch1=branch;
    }
    public void details(){
        System.out.println(name1+" "+age1+" "+rollno1+" "+branch1);
    }
} //

public class methods_constructors {
    static void main(String[] args) {
    person obj=new person("Anas",23,"1RR21IS001","ISE");
        obj.details();
    }
}
