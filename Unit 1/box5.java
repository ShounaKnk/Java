public class box5 {

    static double length, breadth;
    final static double height;

    static
    {height = 1; length= 1;}

    static void viewdata()
    { 
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }
    public static void main(String args[])
    {
        box5.viewdata();
    }
}
