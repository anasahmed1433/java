public class program1 {
    static void main(String[] args) {
        try{

        int a=5;
        int b=3;

            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
