interface A
{
    int a =3;
    void dispA();
}

public class interface_eg implements A{

    /*
     PRoerties:
        1.it is implicitly final and static
        2. if a class doesnt implement the method of interface then the class is declared as
            abstract class 
     */

    
    /*SYNTAX:
    interface interface_name
    {
        return_type method_name();
        datatype var_name = value;
    }
    */
    public void dispA()
    {
        System.out.println("Interface A: "+a);
    }

    public static void main(String args[])
    {
        interface_eg obj = new interface_eg();
        obj.dispA();
    } 
}
