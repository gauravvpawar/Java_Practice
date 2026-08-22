package _02_Set._02_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Linked hash set -> it follow the insertion of element
        - only one null value is can valid in linkedHashSet
        - you can enter Heterogeneous type of data normally
        - by the generics we can specify which data we can store
         */

        LinkedHashSet hs = new LinkedHashSet();
        hs.add(200);
        hs.add(11);
        hs.add(55);
        hs.add(33);
        hs.add(null);
        hs.add(45);
        hs.add(200); // while you add the existing data it just update the data

        System.out.println(hs);

        hs.add('a');
//        hs.add(200); it does not allow to store duplicate value
        Iterator i1 = hs.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
