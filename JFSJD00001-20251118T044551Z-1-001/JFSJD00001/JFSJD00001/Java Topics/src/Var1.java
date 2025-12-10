public class Var1 {
    int b=20;// Instance varaible used outside method but inside the class
    static void main(String[] args) {
        int a=10; // local variable used inside the class
        System.out.println(a);

        Var1 obj = new Var1();
        System.out.println(obj.b);
    }
}

//static is used with the key word static