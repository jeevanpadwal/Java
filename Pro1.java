//accept string small alphabet count
import java.lang.*;
import java.util.*;


class Pro1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();
        int iCnt =0;

        for(int i =0;i < arr.length; i++)
        {
            if(arr[i] >= 'a' && arr[i] <= 'z')
            {
                iCnt++;
            }
        }

        System.out.println("Small character is :"+iCnt);
    }
}