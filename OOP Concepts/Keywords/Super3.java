class Main
{
    Main() 
        {
            System.out.println("I am inn class A");
        }
}
public class Super3 extends Main {
    Super3()
    {
        super();
        System.out.println("I am inn class B");
    }
    public static void main(String[] args) {
        Super3 B = new Super3();
    }
}
