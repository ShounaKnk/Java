/*
    *in java no need to wite explicit if else blocks to detect the errors
    *IF THE PROGRAM DOESNT HAVE APPRROPRIATE EXCEPTION HANDELING MECHANISM DEFINED
     BY USER THEN THE JAVA DEFAULT EXCEPTION HANDLER HANDLES THE EXCEPTIONS
    *IN JAVA THE DEFAULT EXCEPTION HANDLER CAN HANDLE THE EXCEPTIONS
    

    PARTS OF JAVAS EXCEPTION HANDLER:
    *try block: contains the block of code that might generate an error
    *catch block: catches the exception
    *throw: throws an exception if found
    *throws: displays a LIST of exceptions that can occu
    *finally block: HAS TO BE DECLARED AT LAST AFTER ALL THE BLOCKS

    THE PARENT CLASS OF EXCEPTION CLASS IN JAVA IS THROWABLE (ALSO HAS ERROR) 
 */


public class ExceptionHandling {
    
    //BY DEFAULT HANDELER:
    // public static void main(String args[])
    // {
    //     int d =0;
    //     int a = 23/d;
    // }

    public static void main(String args[])
    {
        int a, d;
        try
        {
            d = 0;
            a = 42/d;
            System.out.println("this will not be printed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("division by zero");
            System.out.println("After catch statement");

            /*  we can directly display the exception details as a string
                the inbuilt toString function is the OBject class converts the error
                into the string to display
            */
            // System.out.println(e);
        }
    }
}
