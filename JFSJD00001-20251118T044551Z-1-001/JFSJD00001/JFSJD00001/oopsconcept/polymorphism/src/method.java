class features{
    public void mobile(String name,String Model,String ROM,int RAM,String Processor,int price){
        System.out.println(name+" "+Model+" "+ROM+" "+RAM+" "+Processor+" "+price);
    }
}
class features1 extends features{
@Override
    public void mobile(String name,String Model,String ROM,int RAM,String Processor,int price){
        System.out.println(name+" "+Model+" "+ROM+" "+RAM+" "+Processor+" "+price);
    }

    public void laptop(String name1,String RAM,String ROM,String Graphicscard){
        System.out.println(name1+" "+RAM+" "+ROM+" "+Graphicscard);
    }
}
public class method {
    static void main(String[] args) {
        features1 obj=new features1();
        obj.mobile("Vivo","T1 5G","128 GB",8,"Mediatek",40000);
        obj.laptop("Dell","12 GB","512 SSD","1 GB");
    }
}
