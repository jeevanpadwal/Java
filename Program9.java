//accept no from user  and toggel 4 th and 7 th bit
import java.util.*;
import java.lang.*;

class Bitwise
{
 public int ToggelTwoBit(int iNo)
 {
    int iMask = 0X0000048;
    int iResult = 0;

    iResult = iNo ^ iMask;

   return iResult;
    
 }

}

class Program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter Number");
        int Value = sobj.nextInt();

      Bitwise bobj = new Bitwise();
      int  iret = bobj.ToggelTwoBit(Value);

      System.out.println("Updated Number is :"+iret);

    }
}