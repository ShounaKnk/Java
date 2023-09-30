class Box1
{
    double breadth, length;
    Box1()
    {length=breadth=1;}
    Box1(double l, double b)
    {
        length=l; breadth=b;
    }
    void computarea()
    {
        System.out.println("surface area: "+(breadth*length));
    }
}

public class boxheight
{
    double height;
    boxheight()
    {height=1;}
    boxheight(double l, double b, double h)
    {
        super(l,b); height=h;
    }
}
