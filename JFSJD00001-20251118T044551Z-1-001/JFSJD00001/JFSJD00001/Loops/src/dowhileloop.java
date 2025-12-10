public class dowhileloop {
    static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
       // int i=1;
      //  do
      //  {
       //     System.out.println(i);
         //   i++;
        //}while(i<4);
///////////////////////////////////////////////////
 //       int n=10;
   //     do{
     //       System.out.println(n);
      //      n--; //decrement by 1
       // }while (n>=0);


        for (int i = 1; i <= 4; i++) {  // outer loop for rows  // check if the value is less than 5 it prints the patter if the flop is false

            for (int j = 1; j <=i; j++) // it checks the j value and the j always start with 1 is the come from the outer loop

        {


            System.out.print("*"); // print the pattern line
        }
            System.out.println(); //next line after printing the pattern
        }
    }
}
