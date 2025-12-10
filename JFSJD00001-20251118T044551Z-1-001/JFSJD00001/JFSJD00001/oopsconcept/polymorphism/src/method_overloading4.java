class bank{
    public void bank1(String name,String address){
        System.out.println(name+" "+address);
    }
    public void bank2(String name,String IFSC,long accountno){
        System.out.println(name+" "+IFSC+" "+accountno);
    }
}
public class method_overloading4 {
    static void main(String[] args) {
        bank obj=new bank();
        obj.bank1("HDFC","Bangalore");
        obj.bank2("ICICI","IDIB00101",12345678);
    }
}
