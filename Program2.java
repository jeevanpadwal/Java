//accept no and chk whther 7 bit is on or off import java.lang.*;
import java.util.*;
import java.lang.*;

class Bitwise
{
 public boolean CheakBit(int iNo)
 {
    int iMask =64;
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

class Program2
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