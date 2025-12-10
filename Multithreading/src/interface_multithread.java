class java1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Java Developer");
            try { // time delay after printing on output and will be delay
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class react1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("React Developer");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class interface_multithread {
    static void main(String[] args) {
        java1 obj=new java1();
        react1 obj1=new react1();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();

        t2.start();
    }
}
