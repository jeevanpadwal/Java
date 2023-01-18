import java.lang.*;
import java.util.*;

class Pro13
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int i=0,j=0;
        System.out.println("Enter number of rows ");
        int irow = sobj.nextInt();

        System.out.println("Enter number of colums ");
        int icol = sobj.nextInt();

        int Arr[][] = new int[irow][icol];

        System.out.println("Enter the elements ");
        for(i=0 ;i < Arr.length ;i++)
        {
            for( j =0; j < Arr[i].length ;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(i=0 ;i < Arr.length ;i++)
        {
            for( j =0; j < Arr[i].length ;j++)
            {
                System.out.print(Arr[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}