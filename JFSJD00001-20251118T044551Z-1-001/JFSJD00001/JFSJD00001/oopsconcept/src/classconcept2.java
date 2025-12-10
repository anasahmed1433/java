class car{
    String carname="Ford Fiesta 1.6 D Tech";
    String Price="6.5 Lakh";
    String Color="Black";
    int Model=2007;
    String Regno="KA03MH6925";
}

class Bike{
    String Bikename="RE Bullet 350";
    String Price="3.4 lakh";
    String Color=" Matte Black";
    String Regno="KA41EY6278";
}
public class classconcept2 {
    static void main(String[] args) {

        car obj=new car();
        System.out.println("The name of the car is " +obj.carname);
        System.out.println("The price of the car is " +obj.Price);
        System.out.println("The color of the car is " +obj.Color);
        System.out.println("The Model of the car is " +obj.Model);
        System.out.println("The Reg no of the car is " +obj.Regno);

        System.out.println();

        Bike obj1=new Bike();
        System.out.println("The name of the Bike is " +obj1.Bikename);
        System.out.println("The price of the Bike is " +obj1.Price);
        System.out.println("The color of the Bike is " +obj1.Color);
        System.out.println("The Reg no of the bike is " +obj1.Regno);

    }
}
