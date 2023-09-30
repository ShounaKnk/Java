import java.util.*;

public class linser {

    static int lsrch(int arr[], int n, int x)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        System.out.print("Enter no. of terms: ");
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.print("\nenter the elements of the array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("ARRAY: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x;
        System.out.println("Enetr the element to search: ");
        x = s.nextInt();

        int pos;
        pos = lsrch(arr, n, x);

        if(pos == -1)
            System.out.println("element not found");
        else
            System.out.println("\nELEMENT WAS FOUND AT POSITION: "+pos);
    }
    
}
