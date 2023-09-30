class A{
    interface message
    {void mesg();}
}

public class nested_intf_CLASS implements A.message{
    public void mesg()
    {
        System.out.println("inside the class");
    }

    public  static void main(String args[])
    {
        A.message m = new nested_intf_CLASS();
        m.mesg();
    }
}
