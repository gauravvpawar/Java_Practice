package _02_LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        In linked hash map- it follow insertion order
        it also provide the only one null value
        -it you can store heterogeneous type of data
         */

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1 , "Gaurav");
        lhm.put(2 , "Umesh");
        lhm.put(3 , "Ganesh");

        System.out.println(lhm);

        lhm.put("Hello" , "World");

        Set s1 = lhm.entrySet();
        Iterator i1 = s1.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

    }
}
