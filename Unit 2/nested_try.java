public class nested_try {
    public static void main(String args[])
    {
        // int a = 0;
        // int a = 2;
        int a = 3;
        try{
            int b = 42/a;
            System.out.println("b= "+b);
            try{
                if(a==1)
                    a = a/(a-a);
                if(a ==2)
                {
                    int c[] = {99};
                    c[20] = 30;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
