//accept string reverse at place 
import java.lang.*;
import java.util.*;


class Pro5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");
        String newstr2 = newstr.trim();
        
        String arr[] = newstr2.split(" ");
        

        for(int i =0 ;i< arr.length;i++)
        {
            StringBuffer sb = new StringBuffer(arr[i]);
            System.out.println(sb.reverse());
        }
        
       
    }
}