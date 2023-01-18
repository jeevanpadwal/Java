//accept  string disply frequency of each letter

import java.lang.*;
import java.util.*;


class Pro8
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter 1 st string :");
         String str = sobj.nextLine();
         
         str = str.toLowerCase();
         
         char arr[] = str.toCharArray();
         int Frequency[] =new int[26];

         int j =0;
        
         for(int i =0 ;i < arr.length;i++)
         {
            Frequency[arr[i]-'a']++;
         }
         for(j=0 ; j < Frequency.length;j++)
         {
            if(Frequency[j] > 0)
            {
                System.out.println((char)(j+'a')+" : "+ Frequency[j]);
            }
         }
    }
}