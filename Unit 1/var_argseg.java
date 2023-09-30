
public class var_argseg {
    static void disp(Object ...i)
    {
        for(Object k:i)
        {
            if(k instanceof Integer)
            {
                System.out.println("Integer: " +k.tostring());
            }
            f(k instanceof Double)
            {
                System.out.println("Double: " +k.tostring());
            }
            f(k instanceof Character )
            {
                System.out.println("Double: " +k.tostring());
            }
        }
    }

    static void sum(int ...i)
    {
        int sum = 0;
        for(int k:i)
        {
            sum = sum + k;
        }
        System.out.println("Sum: "+sum);
    }

    public static void main(String args[])
    {
        var_argseg.sum(7, 5 , 8, 6);
        var_argseg.sum(5, 2 , 8);
    }

}
