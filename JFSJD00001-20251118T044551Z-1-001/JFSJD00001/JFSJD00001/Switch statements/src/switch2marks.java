import java.util.Scanner;

public class switch2marks {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else {
            int gradeGroup = marks / 10; // groups 90–100 as 9–10, 80–90 as 8-9, etc.

            switch (gradeGroup) {
                case 10:
                case 9:
                    System.out.println("Grade: A");
                    break;
                case 8:
                    System.out.println("Grade: B");
                    break;
                case 7:
                    System.out.println("Grade: C");
                    break;
                case 6:
                    System.out.println("Grade: D");
                    break;
                case 5:
                    System.out.println("Grade: E");
                    break;

                default:
                    System.out.println("Fail");
            }
        }
    }
}