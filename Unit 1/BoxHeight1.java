class Box2
{
    double d1, d2;
    Box2()
    {d1=d2=1;}
    void computeArea()
    {
        System.out.println("surface area: " +(d1*d2));
    }
}

class BoxHeight1 extends Box2
{
    double d1;
    BoxHeight1()
    {
        d1=1;
    }
    BoxHeight1 (double l, double b, double h)
    {
        super.d1=l;
        super.d2=b;
        super.d1=h;
    }
    void computeVolume()
    {
        System.out.println("Volume: "+(super.d1*super.d2*super.d1));
    }
    public static void main(String args[])
    {
        BoxHeight1 b1 = new BoxHeight1(2, 3, 2);
        b1.computeArea();
        b1.computeVolume();
    }
}