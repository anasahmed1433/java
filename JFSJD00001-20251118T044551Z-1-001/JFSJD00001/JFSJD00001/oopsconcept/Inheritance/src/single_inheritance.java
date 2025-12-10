class ParentA
{
    public void parent(){
    System.out.println("Hello Parent");
}
}
class ChildB extends ParentA
{
    public void child()
    {
        System.out.println("Hello child and Parent");
}
}
public class single_inheritance {
    static void main(String[] args) {
    ChildB obj=new ChildB();
    obj.parent();
    obj.child();
    }
}