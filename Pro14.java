//addition of all the elements
//additon of even 
//addition of odd
//display lrgest element for matrix
//display largest from each row
//each row reverse data 
//same question for colum
//display addition of border elements 
//

import java.lang.*;
import java.util.*;

class Pro14
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
            int iSum =0;
        for(i=0 ;i < Arr.length ;i++)
        {
            for( j =0; j < Arr[i].length ;j++)
            {
              //addition of each row 
                
             iSum =iSum + Arr[i][j];
                
            }
            System.out.print("\n");
            System.out.println("Addition of Row :"+iSum);
            iSum =0;
        }
    }
}