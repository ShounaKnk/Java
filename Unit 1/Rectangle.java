class Shape
{
    double d1, d2;
    Shape()
    {d1=d2=1;}

}
public class Rectangle extends Shape
{
    double d1, d2;
    Rectangle()
    {d1=d2=1;}

    Rectangle(double b, double h)
    {
        super.d1= b;
        super.d2 = h;
    }
    void computeArea()
    {
        System.out.println("Area: "+(0.5*super.d1*super.d2));
    }

    public static void main(String args[])
    {
        Rectangle r = new Rectangle(8, 5);
        r.computeArea();
    }
}
