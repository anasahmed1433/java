class A{
    public void demo(){
        System.out.println("Hello parent");
    }
}
class B extends A{

    public void demo1() {
        System.out.println("Hello parent and child 1");
    }
}
class C extends A{
    public void demo3() {
        System.out.println("Hello parent and child 2");
    }
}
public class hiearchial_inheritance {
    static void main(String[] args) {
        C obj=new C();
        obj.demo();
        obj.demo3();

    }
}