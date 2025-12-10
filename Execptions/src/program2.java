public class program2 {
    public static void main(String[] args) {
        int a=10;int b=0;
        try {
          /*  int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  */ // ArrayIndexOutOfBoundsException
            int result = a/b;
            System.out.println(result);// ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        catch (Exception e) {
            System.out.println("Something else went wrong.");
}
}
}