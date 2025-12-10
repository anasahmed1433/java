class A{
    A(){ //constructor shld be same as class name
        System.out.println("Hello");
    }
    A(int a){
        System.out.println(a);
    }
    A(int a,int b){
        System.out.println(a+" "+b);
    }

}
public class constructor {
    static void main(String[] args) {

        A obj=new A();
        A obj1=new A(4);
        A obj2=new A(3,5);
    }
}
