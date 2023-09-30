interface shape
{
    void area();
}

/*
    here class quad is just used to declaare the variables and doesnt implement the method of
    interface shape
 */

abstract class quad implements shape{
    double dim1, dim2;
}

class rectangle extends quad{
    public void area()
    {
        System.out.println("area of retangle: "+(dim1*dim2));
    }
}

class square extends quad{
    public void area(){
        System.out.println("area of square: "+(dim1*dim1));
    }
}


public class abstractclass_interface {
    public static void main(String args[])
    {
        rectangle r = new rectangle();
        r.dim1 = 4;
        r.dim2 = 2;
        r.area();

        square s = new square();
        s.dim1 = 6;
        s.area();
    }    
}
