interface showable
{
    void show();
    interface Message{
        void msg();
    }
}

public class nested_interfaces implements showable.Message{

    public void msg()
    {
        System.out.println("nested interface");
    }

    public static void main(String args[])
    {
        showable.Message message = new nested_interfaces();
        message.msg();
    }
    
}
