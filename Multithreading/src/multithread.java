class java extends Thread{
    public void run(){

        for(int i=0;i<5;i++) {
            try {     // Time delay before the starting of the program
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Java Developer");
            try { // time delay after printing on output and will be delay
                    Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class react extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("React Developer");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class multithread {
    static void main(String[] args) {
        java obj=new java();
        react obj1=new react();
        obj.start();

        obj1.start();
    }
}
