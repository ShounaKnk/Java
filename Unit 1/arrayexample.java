import java.util.*;
public class arrayexample {
    public static void main(String args[])
    {
        int a[] = {24,67,78};
        for(int i =0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        Scanner s = new Scanner (System.in);
        System.out.print("\nEnter thenumber of elements: ");
        int n = s.nextInt();
        int b[] = new int[n];
        System.out.println("enter "+n+" elemts");
        for(int i=0; i<b.length; i++)
        {
            b[i] = s.nextInt();
        }
        System.out.println("array B:");
        for(int i=0; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
