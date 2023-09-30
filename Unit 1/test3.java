class box4
{
    double length, height, breadth;
    box4(){length=height=breadth=1;}
    box4(double l, double b, double h)
    {
        length=l;breadth =b; height=h;
    }
    protected void finalize()
    {
        System.out.println("Object destroyed");
    }
}

public class test3
{
    public static void main(String args[])
    {
        box4 b1 = new box4();
        System.out.println("BOx 1 details: ");
        System.out.println("Length: "+b1.length);
        System.out.println("Breadth: "+b1.breadth);
        System.out.println("Height: "+b1.height);

        b1=null;
        System.gc();
    }
}
