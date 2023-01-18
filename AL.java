import java.lang.*;
import java.util.*;

class AL
{
    public static void main(String arg[])
    {
      ArrayList <String>obj = new ArrayList <String> ();

      obj.add("January");
      obj.add("february");
      obj.add("Martch");
      obj.add("April");
      obj.add(2,"New");
      obj.add("Marvellous");
      obj.add("Marvellous");
      obj.add("Marvellous");


      System.out.println("Arrylist contains :"+obj);
      System.out.println("Size is:"+obj.size());
      
        System.out.println("Elements using loop"+obj);
    for(int i=0;i<obj.size();i++)
    {
        System.out.println(obj.get(i));
    }     
    String str;
    int Cnt=0;
    for(int i=0;i<obj.size();i++) 
    {
        str=obj.get(i);
        if(str.equals("Marvellous"))
        {
            System.out.println("Elemnts is there");
        }
    }
      if(obj.contains("April"))
      {
          System.out.println("Elemnt is there");
      }
      
      int ret=obj.indexOf("April");
      System.out.println("Elemnt is at :"+ret);

      System.out.println("Elemnt at index  3 :"+obj.get(3));

      obj.remove(3);
      obj.remove("April");
      System.out.println("Updated list is :"+obj);

      Iterator iobj =obj.iterator();
      while(iobj.hasNext())
      {
          System.out.println("Upadate ,list is :"+iobj.next());
      }


      obj.clear();
      System.out.println("Upadated list is:"+obj);

    }
}



