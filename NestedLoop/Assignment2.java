// Print blank Square
public class Assignment2 {
  public static void main(String[] args) throws Exception {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        if ((i == 2 && j > 1 && j < 4) || (i == 3 && j > 1 && j < 4)) {
          System.out.print("   ");
        } else {
          System.out.print(" * ");
        }
      }
      System.out.println();
    }
  }
}