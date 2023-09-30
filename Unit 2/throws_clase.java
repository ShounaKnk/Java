public class throws_clase {
    static void demoPRac() throws IllegalAccessException
    {
        throw new IllegalAccessException();
    }

    public static void main(String args[])
    {
        try{
            demoPRac();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("error: "+e);
        }
    }
}
