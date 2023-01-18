//accept no from user cheak 27 bit is off then on that bit
import java.util.*;
import java.lang.*;

class Bitwise
{
 public int OnBit(int iNo)
 {
    int iMask = 0X04000000;
    int iResult = 0;

    iResult = iNo | iMask;

   return iResult;
    
 }

}

class Program7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter Number");
        int Value = sobj.nextInt();

      Bitwise bobj = new Bitwise();
      int  iret = bobj.OnBit(Value);

      System.out.println("Updated Number is :"+iret);

    }
}