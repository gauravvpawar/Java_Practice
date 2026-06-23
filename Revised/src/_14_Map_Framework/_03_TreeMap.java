package _14_Map_Framework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class _03_TreeMap
{
    public static void main(String[] args) {
        /*
        Tree map follow binary search tree data structure
        no null value in tree map
         */

        TreeMap tm = new TreeMap();
        tm.put(3, "Dhoni");
        tm.put(1 , "virat");
        tm.put(2, "rohit");

        System.out.println(tm); //  does not maintain the order
        // but by default it stores element in ascending order

        Set s = tm.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
