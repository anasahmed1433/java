class college{
    String collegename;
    String branch;
    String branch1;
    String branch2;
    int phoneno;
    String email;
    String location;

    college(String collegename,String branch,String branch1,String branch2,int phoneno,String email,String location){
        this.collegename=collegename;
        this.branch=branch;
        this.branch1=branch1;
        this.branch2=branch2;
        this.phoneno=phoneno;
        this.email=email;
        this.location=location;
    }
    public void cdetails(){
        System.out.println(collegename+" \n"+branch+"\n"+branch1+"\n"+branch2+"\n"+phoneno+"\n"+email+"\n"+location);
    }
}
class dept extends college{
    String deptname;
    String deptid;

    dept(String deptname,String deptid,String collegename,String branch,String branch1,String branch2,int phoneno,String email,String location){
        super( collegename,branch,branch1,branch2,phoneno,email,location);
        this.deptname=deptname;
        this.deptid=deptid;
    }
    public void ddetails(){
        System.out.println(deptname+"\n"+deptid+"\n"+collegename+" \n"+branch+"\n"+branch1+"\n"+branch2+"\n"+phoneno+"\n"+email+"\n"+location);
    }
}
class student extends dept{
    String name;
    String USN;
    String branch3;
    long phone;

    student(String name,String USN,String branch3,long phone,String deptname,String deptid,String collegename,String branch,String branch1,String branch2,int phoneno,String email,String location){
        super(deptname,deptid,collegename,branch,branch1,branch2,phoneno,email,location);
        this.name=name;
        this.USN=USN;
        this.branch3=branch3;
        this.phone=phone;
    }
    public void sdetails(){
        System.out.println(name+"\n"+USN+"\n"+branch3+"\n"+phone+"\n"+deptname+"\n"+deptid+"\n"+collegename+" \n"+branch+"\n"+branch1+"\n"+branch2+"\n"+phoneno+"\n"+email+"\n"+location);
    }
}
public class multilevel_inheritance1 {
    static void main(String[] args) {
        student obj=new student("Anas","1RR21IS023","ISE",8147084,"ISE","1RR21IS","RRCE","AIML","ISE","CSE",12345678,"rrce@gmail.com","Bangalore");
    obj.sdetails();
    }
}