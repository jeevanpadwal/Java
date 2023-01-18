//accept no from user  and toggel 4 th bit
import java.util.*;
import java.lang.*;

class Bitwise
{
 public int Toggel(int iNo)
 {
    int iMask = 0X0000008;
    int iResult = 0;

    iResult = iNo ^ iMask;

   return iResult;
    
 }

}

class Program8
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter Number");
        int Value = sobj.nextInt();

      Bitwise bobj = new Bitwise();
      int  iret = bobj.Toggel(Value);

      System.out.println("Updated Number is :"+iret);

    }
}