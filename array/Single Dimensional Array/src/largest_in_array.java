public class largest_in_array {
    static void main(String[] args) {
        int array[]={4,2,9,12,3,1};
        int large=array[0]; //4 is tha laegest element
        for(int i=1;i<array.length;i++)
        {
         if(array[i]>large)
         {
             large=array[i];
         }
        }
        System.out.println(large);
    }
}
