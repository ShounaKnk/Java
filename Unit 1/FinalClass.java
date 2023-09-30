final class A3
{
    double a3;
    void disp1()
    {
        System.out.println("a3=" +a3);
    }
}

public class FinalClass {
    public static void main(String args[])
    {
        A3 obj = new A3();
        obj.a3 = 23;
        obj.disp1();
    }
}
