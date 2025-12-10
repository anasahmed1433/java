class car{
    String fueltank;
    String nofsetear;

    car(String fueltank,String nofsetear){
        this.fueltank=fueltank;
        this.nofsetear=nofsetear;
    }

    public void cdetails(){
        System.out.println(fueltank+" \n"+nofsetear);

    }
}
class car1 extends car{
    String color;
    int price;
    String model;

    car1(String color,int price,String model,String fueltank,String nofseater)
    {
        super(fueltank,nofseater);
        this.color=color;
        this.price=price;
        this.model=model;
    }
    public void c1details()
    {
        System.out.println(color+" "+price+" "+model+" "+fueltank+" "+nofsetear);
    }
}
class car2 extends car
{
    String color1;
    int price1;
    String model1;

    car2(String color1,int price1,String model1,String fueltank,String nofseater)
    {
        super(fueltank,nofseater);
        this.color1=color1;
        this.price1=price1;
        this.model1=model1;
    }
    public void c2details(){
        System.out.println(color1+" "+price1+" "+model1+" "+fueltank+" "+nofsetear);
    }
}

public class hiearchy
{
    static void main(String[] args)
     {
    car2 obj=new car2("Black",500000,"2025","45 litre","5 seater");
    obj.c2details();
    car1 obj1=new car1("White",600000,"2024","60 litre","7 seater");
    obj1.c1details();
    }
}
