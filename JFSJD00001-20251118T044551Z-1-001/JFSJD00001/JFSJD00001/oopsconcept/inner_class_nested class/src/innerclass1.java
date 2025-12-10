class outer1{
    private int age=10;
    public class inner1{
        int getvalue(){
            return age;
        }
    }
}
public class innerclass1 {
    static void main(String[] args) {
        outer1 obj=new outer1();
        outer1.inner1 obj2=obj.new inner1();
        System.out.println(obj2.getvalue());
    }
}
