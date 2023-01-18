//accept string number of words 
import java.lang.*;
import java.util.*;


class Pro3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");
        String newstr2 = newstr.trim();
        
        String arr[] = newstr2.split(" ");
        

        

        System.out.println("Number of words are :"+arr.length);
    }
}