class vehicle{
    String name1;String regNo1;int price1;
    vehicle(String name,String regNo,int price){
        name1=name;
        regNo1=regNo;
        price1=price;
    }
    public void vehicleDetails(String color){
        System.out.println(name1+"\n"+regNo1+"\n"+price1+"\n"+color);
    }
}
public class vehiclesdetails {
    public static void main(String[] args) {
        vehicle obj=new vehicle("BMW M5 COMPETETION","AP02AA1234",20000000);

        obj.vehicleDetails("BLACK");
}
}