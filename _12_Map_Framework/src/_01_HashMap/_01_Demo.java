package _01_HashMap;

import java.util.*;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        hashmap does not follow the insertion order of element
        - it does not contain duplicate keys
         */
        HashMap hs = new HashMap();
        hs.put(1 , "Java");
        hs.put(2 , "DBMS");
        hs.put(3 , "C");
        hs.put(4 , "C++");
        hs.put(null, null);

        System.out.println(hs);

//        hs.put(null , "C#");  it cant store

//        to print all key from entry
        Set s1 = hs.keySet();
        Iterator i1 = s1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        // to print all tha values ------------------------------------------------------------------------------
        Collection s2 = hs.values();
        Iterator i2 = s2.iterator();
        while (i2.hasNext())
        {
            System.out.println(i2.next());
        }

        System.out.println("----------------------------------print key and values------------------------------------");

        // to print all the key and values by using Entryset
        Set s3 = hs.entrySet();
        Iterator i3 = s3.iterator();
        while (i3.hasNext())
        {
            System.out.println(i3.next());
        }

        System.out.println("-------------------------------access that key and values -----------------------------------");
        Set s4 = hs.entrySet();
        Iterator i4 = s4.iterator();
        while (i4.hasNext())
        {
            Map.Entry me = (Map.Entry)i4.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
