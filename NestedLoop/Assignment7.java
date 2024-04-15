// Print Triangle [1,3,5,7]
public class Assignment7 {
    public static void main(String[] args) {
        int rows = 4;
        int spaces = rows - 1;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();

            spaces--;
            stars = stars + 2;
        }
    }
}
