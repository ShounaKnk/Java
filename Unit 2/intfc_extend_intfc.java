/*
 * when inheritence concept ids aplied to interfaces then the class
 * implementing the derived interfaces must implement the method of
 * the derived of a derived interfaces as well as the methods of the base interfaces
 */

interface Animal
{
    void dispAnimal(String a);
}

interface Herbivore extends Animal
{
    void dispHerbivore();
}

interface Carnivore extends Animal
{
    void dispCarnivore();
}

public class intfc_extend_intfc implements Herbivore, Carnivore{
    public void dispAnimal(String a)
    {
        System.out.println("animal: "+a);
    }

    public void dispHerbivore()
    {
        System.out.println("feeds on vegetation");
    }

    public void dispCarnivore()
    {
        System.out.println("feeds on meat");
    }
 
    public static void main(String args[])
    {
        intfc_extend_intfc i1 = new intfc_extend_intfc();
        intfc_extend_intfc i2 = new intfc_extend_intfc();

        i1.dispAnimal("girafe");
        i1.dispHerbivore();

        i2.dispAnimal("Lion");
        i2.dispCarnivore();
    }
}
