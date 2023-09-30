public class MULTICATCH {
    public static void main(String args[])
    {
        try
        {
            int a = args.length;
            //int a = 1;
            System.out.println("a = "+a);
            int b = 42/a;
            int c [] = {1};
            c[42] = 99;
        }
        catch(ArithmeticException e)
        {
            System.out.print("Divide by ZERO: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bound: "+e);
            System.out.println("after catch");
        }
    }
}
