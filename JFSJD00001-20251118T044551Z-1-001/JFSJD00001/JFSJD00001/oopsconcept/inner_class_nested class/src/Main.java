class outer{
     private class inner{
        public void innermethod(){
            System.out.println("Inner class data");
        }
    }
    void details(){
        inner obj=new inner();
        obj.innermethod();
    }
}
public class Main {
    static void main(String[] args) {
        outer obj=new outer();
        obj.details();
    }
}