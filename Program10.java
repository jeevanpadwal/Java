//accept no from user and as wll as position from user and toggel that position bit
import java.util.*;
import java.lang.*;

class Bitwise
{
 public int ToggelBitAtPos(int iNo,int iPos)
 {
    if(iPos <= 0 || iPos > 32)
    {
        System.out.println("Invalid posion");
        return 0;
    }
    int iMask = 0X00000001;

    int iResult = 0;
    iMask = iMask << (iPos-1);

    iResult = iNo ^ iMask;

   return iResult;
    
 }

}

class Program10
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter Number");
        int Value = sobj.nextInt();

        System.out.println("Enter position for toggel bit");
        int iPos = sobj.nextInt();

      Bitwise bobj = new Bitwise();

      int  iret = bobj.ToggelBitAtPos(Value,iPos);

      System.out.println("Updated Number is :"+iret);

    }
}