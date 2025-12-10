public class Multidimesion1 {
    static void main(String[] args) {
        int arrays[][]={
                {2,4,7},
                {5,6,1},
                {4,9,3}
        };
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}
