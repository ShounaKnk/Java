import java.util.Scanner;

public class array2d {
    public static void main(String args[])
    {
        int m =2;
        int n = 3;
        int a[][]= new int[m][n];
        Scanner s = new Scanner(System.in);

        System.out.print("enter "+(m*n)+" elements");
        for(int i =0; i<m; i++)
        {
            System.out.print("row "+i+":\t");
            for(int j =0; j<n; j++)
            {
                a[i][j] = s.nextInt();
            }
        }

        int c[][] = new int [3][];
        c[0] = new int[2];
        c[1] = new int[3];
        c[2] = new int[4];
        int k = 2;
        for(int i=0; i<c.length; i++)
        {
            System.out.println("row "+i+" :(enter "+k+" nos)");
            for(int j=0; j<k; j++)
            {
                c[i][j] = s.nextInt();
            }
            k++;
        }
        k=2;
        for(int i=0; i<c.length; i++)
        {
            for(int j=0; j<k; j++)
            {
                System.out.print(c[i][j]+" ");
            } 
            System.out.println();
            k++;    
        }
    }
}
