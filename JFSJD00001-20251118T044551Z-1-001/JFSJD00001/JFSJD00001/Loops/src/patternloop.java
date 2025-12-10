public class patternloop {
    static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {  // outer loop for rows  // check if the value is less than 5 it prints the patter if the flop is false
        for (int j = 1; j <=i; j++) // it checks the j value and the j always start with 1 is the come from the outer loop
        {
            System.out.print(" * "); // print the pattern line
        }
        System.out.println(); //next line after printing the pattern
    }
}
}
