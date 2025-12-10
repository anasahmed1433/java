abstract class anees{
    abstract void person(String name,int age);
}
class anas extends anees{
    void person(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class abstract1 {
    static void main(String[] args) {
        anas obj=new anas();
        obj.person("Anas",23);
    }
}
