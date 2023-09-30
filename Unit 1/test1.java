
class Box2
{
        double length, height, breadth;
        Box2(){length=height=breadth=1;}
        Box2(double length, double breadth, double height)
        {
            this.length = length;
            this.breadth= breadth;
            this.height = height;
        }

        Box2(Box2 b)
        {length= b.length; breadth = b.breadth; height = b.height;}
        void computeArea()
        {System.out.println("area= "+(length*breadth));}
        void computeVolume()
        {
            System.out.println("volume="+(length*breadth*height));
        }
}

class test1
{
    public static void main (String arg[])
    {
        Box2 b1 = new Box2 (2, 3, 4);
        System.out.println("Box1 details: ");
        System.out.println("length: "+b1.length);
        System.out.println("breadth: "+b1.breadth);
        System.out.println("height: "+b1.height);
        b1.computeArea();
        b1.computeVolume();
        }  
}