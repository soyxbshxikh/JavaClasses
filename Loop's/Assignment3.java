
// Number Of Factorial
import java.util.Scanner;

class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is " + factorial);
        input.close();
    }
}
