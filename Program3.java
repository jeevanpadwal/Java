//accept no from user cheak 21 bit on or off
import java.util.*;
import java.lang.*;

class Bitwise
{
 public boolean CheakBit(int iNo)
 {
    int iMask =1048576;
    int iResult =0;

    iResult = iNo & iMask;

    if(iResult == 0)
    {
        return false;
    }
    else
    {
        return true;
    }
    
 }

}

class Program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter Number");
        int Value = sobj.nextInt();

      Bitwise bobj = new Bitwise();
      boolean bret = bobj.CheakBit(Value);

      if(bret == true)
      {
        System.out.println("Bit is on");
      }
      else
      {
        System.out.println("Bit is off");
      }

    }
}