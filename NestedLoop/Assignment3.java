// Print Blank Triangle in Left Side
public class Assignment3 {
  public static void main(String[] args) throws Exception {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == 3 && j > 1 && j < 3) {
          System.out.print("   ");
        } else {
          System.out.print(" * ");
        }
      }
      System.out.println();
    }
  }

}
