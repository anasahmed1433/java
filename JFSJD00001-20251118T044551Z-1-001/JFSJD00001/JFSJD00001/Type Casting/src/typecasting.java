public class typecasting {
    static void main(String[] args) {
        byte b=12; // 1 byte
        int i=b; // storing 1 byte in 4 byte
        System.out.println(i);

        // Narrowing
        double j=13.12456787;
        int g=(int) j;
        System.out.println(g);
    }
}
