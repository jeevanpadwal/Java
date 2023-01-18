import java.lang.*;
import java.util.*;

class V
{
    public static void main(String arg[])
    {
      Vector <Integer>obj = new Vector <Integer> (12);
       
      obj.add(11);
        obj.add(21);
          obj.add(51);
            obj.add(101);
              obj.add(111);
              obj.add(111);
             obj.add(110);
              obj.add(112);

               System.out.println("Capacity :"+obj.capacity());
                System.out.println("Size :"+obj.size());

        int i=0;
        for(i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
        
        int no=0,cnt=0;
        for(i=0;i<obj.size();i++)
        {
            no=obj.get(i);
            if(no%2==0)
            {
                cnt++;
            }
        }
        System.out.println("even elemet :"+cnt);
        

        Iterator iobj =obj.iterator();
        while(iobj.hasNext());
        {
            System.out.println(iobj.next());
        }
        obj.clear();
    }
}

      