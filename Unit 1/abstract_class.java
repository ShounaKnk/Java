abstract class Shape2
{
    double d1, d2;
    void setdim(double dim1, double dim2)
    {
        d1 = dim1;
        d2 = dim2;
    }
    abstract void area();
}

class Rectangle1 extends Shape2
{
    void area()
    {
        System.out.println("area of rectangle: "+(d1*d2));
    }
}

class Triangle extends Shape2
{
    void area()
    {
        System.out.println("area of triangle: " +(0.5*d1*d2));
    }
}

public class abstract_class {
    
    public static void main(String args[])
    {
        Shape2 s;
        s = new Triangle();
        s.setdim(2,5);
        s.area();

        s = new Rectangle1();
        s.setdim(5,4);
        s.area();
    }
}
