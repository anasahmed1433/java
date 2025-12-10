abstract class bird{
    String name;
    String color;
    bird(String name,String color){
        this.name=name;
       this.color=color;
    }
    abstract void bird1(String name,String color);
    abstract void bird2(String name,String color,int age);

void dog(String dogname,String breed,String color){
    System.out.println(dogname+" "+breed+" "+color);
}

}
class bird1 extends bird{

    bird1(String name,String color){
        super(name, color);
    }
    @Override
    void bird1(String name, String color) {
        System.out.println(name+" "+color);
    }

    @Override
    void bird2(String name, String color, int age) {
        System.out.println(name+" "+color+" "+age);
    }


}
public class abstraction2 {
    static void main(String[] args) {
       bird1 obj=new bird1("Parrot","Green");
       obj.bird1("Parrot","Green");
       obj.bird2("Eagle","Brown",2);
       obj.dog("Husky","Husky","Gold");
    }
}
