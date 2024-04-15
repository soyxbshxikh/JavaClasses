
// Enter Any Two Number of Table[5,10] and Print Common Number of Both the Tables
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Value: ");
        int a = sc.nextInt();
        System.out.print("Enter Any Value: ");
        int b = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int t1 = a * i;
            for (int j = 1; j <= 10; j++) {
                int t2 = b * j;
                if (t1 == t2) {
                    System.out.println(t2 + " ");

                }
            }

        }
        sc.close();
    }
}
