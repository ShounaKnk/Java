import java.util.*;

public class binarysearch {
    public static void main(String args[])
    {
        System.out.print("size:");
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("size: "+n);
        int arr[] = new int[n];
        System.out.print("Enter the array elements in ascending order: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.print("Array: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nenter the element to search: ");
        int x = s.nextInt();

        int pos = -1;
        int low = 0;
        int high = n-1;

        for(int i=0; i<=arr.length; i++)
        {
            int mid;
            mid = (high+low)/2;
            if(arr[mid] == x)
            {
                pos = mid;
            }
            else if(x<arr[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        if(pos == -1)
            System.out.println("element not found");
        else
                System.out.println("element found at pos: "+pos);
    }
    
}
