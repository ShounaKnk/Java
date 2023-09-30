/*TO EXPLICITLY THROW AN EXCEPTION
SYNTAX:
    throw throwableinstance(in built exception class like arrayindexoutofbound)

    *** u cannot throw premitive datatypes or non-throwable classes


*/
public class throw_statements {

    static void demoPrac()
    {
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            System.out.println("exception caught");
            throw e;
        }
    }

    public static void main(String args[])
    {
        try
        {
            demoPrac();
        }
        catch(NullPointerException e)
        {
            System.out.println("recaught: "+ e);
        }
    }
}
