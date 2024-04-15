// Print Blank Triangle [1,3,5,7]
public class Assignment8 {
    public static void main(String[] args) {
        int rows = 4;
        // int spaces = rows - 1;
        // int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 4 || k == 1 || k == 2 * i - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}