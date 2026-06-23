package _14_Map_Framework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class _02_LinkedHashMap
{
    public static void main(String[] args) {
        /*
        Linked Hash Map it follow the hash table and linked list data structure
        it maintain the order of insertion
         */

        LinkedHashMap ls = new LinkedHashMap();
        ls.put(1 , "orange");
        ls.put(2 , "apple");
        ls.put(3 , "mango");

        System.out.println(ls);

       Set s =  ls.entrySet();
      Iterator i = s.iterator();
      while (i.hasNext())
      {
          System.out.println(i.next()); //  it print the obect
      }
    }
}
