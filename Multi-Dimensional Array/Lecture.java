// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.print("Enter four Numbers\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Your Matrix are\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}