public class finally_block {
    static void demoprac()
    {
        try{
            throw new RuntimeException();
        }
        finally
        {
            System.out.println("FInally block done");
        }
    }

    public static void main(String args[])
    {
        try{
            demoprac();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/*
    checked exception:
    checked during COMPILE TIME 
    eg. IoException

    Unchechecked Exception
    checked during RUN TIME
    eg. ArithmeticException



*/