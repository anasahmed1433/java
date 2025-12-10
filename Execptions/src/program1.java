public class program1 {
    static void main(String[] args) {
        try{

        int a=4;
        int b=2;

            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
