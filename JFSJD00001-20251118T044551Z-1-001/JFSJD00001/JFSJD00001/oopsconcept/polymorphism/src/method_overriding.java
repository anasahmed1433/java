class parent{
    public void mobile(){
        System.out.println("Samsung");
    }
}
class child extends parent{
    @Override
    public void mobile(){
        System.out.println("Iphone");
    }
}
public class method_overriding {
    static void main(String[] args) {
        child obj=new child();
        obj.mobile();
    }
}
