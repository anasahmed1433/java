class shapes{
    public int area(int s) { //same method name but with differnet parameters
        return s*s;
    }
    public int area(int l,int b) {

        return l*b;
    }
    public double area(double r) {

        return 3.14*r*r;
    }


}
public class method_overloading1 {
    static void main(String[] args) {
        shapes obj=new shapes();
        System.out.println("area of square is: "+obj.area(5));
        System.out.println("area of rectangle is: "+obj.area(4,6));
        System.out.println("area of circle is: "+obj.area(4.1));
    }
}
