//accept string reverse at place 
import java.lang.*;
import java.util.*;


class Pro6
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter string :");
         String str = sobj.nextLine();

         String newstr = str.replaceAll("\\s+"," ");
         String newstr2 = newstr.trim();
        
         String arr[] = newstr2.split(" ");
         StringBuffer finalstr = new StringBuffer();

         for(int i =0 ;i< arr.length;i++)
         {
            StringBuffer sb = new StringBuffer(arr[i]);
             finalstr.append((sb.reverse()).append(" "));
         }
        
         String finalstr2 = new String(finalstr);
         System.out.println(finalstr2.trim());
         System.out.println(finalstr2.length());
    }
}