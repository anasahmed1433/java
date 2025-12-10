public class char_array {
    public static void main(String[] args) {
        char array[]={'A','N','A','S'};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        array[3]='H';
        System.out.print(array);
    }
}
