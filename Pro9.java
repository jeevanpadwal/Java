//accept  string disply letter occurs maximum time 

import java.lang.*;
import java.util.*;


class Pro9
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

         int iMax =0;
         int iPos =0;

         for(j=0 ; j < Frequency.length;j++)
         {
             if(Frequency[j] > iMax) 
             {
                iMax = Frequency[j];
                iPos =j;
             } 
         }

         System.out.println((char)(iPos+'a') + " Occurance "+iMax +"  Number of times in the word");
    }
}