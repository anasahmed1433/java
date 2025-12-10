class vehicle{
    String color;
  vehicle(String color){
        this.color=color;
    }
    public void vdetails(){
        System.out.println(color);
    }
}
class car extends vehicle{
    String regno;
    int price;
    car(String regno,int price,String color){
        super(color);
        this.regno=regno;
        this.price=price;
    }
    public void cdetails(){
        System.out.println(regno+" "+price+" "+color);
    }
}
class bike extends car{
    String bikename;

    bike(String bikename,String regno,int price,String color){
        super(regno, price, color);
        this.bikename=bikename;
    }
    public void bdetails(){
        System.out.println(bikename+" "+regno+" "+price+" "+color);
    }
}

public class multilevel {
    static void main(String[] args) {
        bike obj=new bike("bullet","ka03mh6925",600000,"black");
        obj.bdetails();
    }
}
