package _02_Set._01_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Hash set it follow the hashtable property
        it does not follow the insertion order
        it does not print in the sorted format
        - you cant enter the duplicate value
        - you cant add element through indexing
         */

        HashSet Hs = new HashSet();
        Hs.add(100);
        Hs.add(55);
        Hs.add(33);
        Hs.add(65);
        Hs.add(22);


        System.out.println(Hs);
        // you cant enter duplicate values
        Hs.add(22);
        System.out.println(Hs);

        Iterator i1 = Hs.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
