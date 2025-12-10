class Cat{
    String name="Muiza";
    int age=2;
    String color= "Golden White";

}

class Dog{
    String dname="Sheeru";
    int dage=4;
    String dcolor= "Golden Retriver";
}
public class classconcept {
    static void main(String[] args) {
        Cat obj=new Cat();

        System.out.println("The name of the cat is " +obj.name);
        System.out.println("The age of the cat is " +obj.age);
        System.out.println("The color of the cat is " +obj.color);

        System.out.println();

        Dog obj1=new Dog();
        System.out.println("The name of the cat is " +obj1.dname);
        System.out.println("The age of the cat is " +obj1.dage);
        System.out.println("The color of the cat is " +obj1.dcolor);

    }
}
