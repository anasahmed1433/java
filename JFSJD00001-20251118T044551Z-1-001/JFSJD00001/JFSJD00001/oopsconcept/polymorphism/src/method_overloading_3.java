class interest{
    public double rate(double p,double r){
        return p*r/100;
    }
    public double rate1(double p,double r,double t){
        return p*r*t/10;
    }
}
public class method_overloading_3 {
    static void main(String[] args) {
        interest obj=new interest();
        System.out.println("the rate of interest is "+obj.rate(25,45));
        System.out.println("the rate of interests is "+obj.rate1(4,6,8));
    }
}
