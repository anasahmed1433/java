class outer2{
    void demo(){
        class inner{
            void demo2(){
                System.out.println("method local inner class");
            }
        }
        inner obj=new inner();
        obj.demo2();
    }
}
public class innerclass2 {
    static void main(String[] args) {
     outer2 obj=new outer2();
     obj.demo();
    }
}
