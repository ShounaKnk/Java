interface edible
{
    String howtoEat();
}
abstract class Animal{
    abstract String sound();
}

class Tiger extends Animal
{
    String sound()
    {
        return "roaar";
    }
}

class Cow extends Animal implements edible
{
    public String howtoEat()
    {
        return "cheese";
    }

    String sound()
    {
        return "moooo";
    }
}

abstract class fruit implements edible{}

class Orange extends fruit 
{
    public String howtoEat()
    {
        return "Orange Squash";
    }
}

class Apple extends fruit
{
    public String howtoEat()
    {
        return "Apple cider";
    }
}


public class interface_heirarchy {
    public static void main(String args[])
    {
        Object obj[] = {new Tiger(), new Apple(), new Cow(), new Orange()};
        for(Object temp  : obj)
        {
            System.out.println("class: "+temp.getClass());
            System.out.println("\t"+((edible)temp));
            if(temp instanceof Animal)
                {
                    System.out.println("Class: "+ temp.getClass());
                    System.out.println("\t"+((Animal)temp));
                }
            }
    }
}
