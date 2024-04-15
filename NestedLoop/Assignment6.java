// Print Blank Triangle in Right Side
public class Assignment6 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (4 - i); j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 3 && k > 1 && k < 3) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}
