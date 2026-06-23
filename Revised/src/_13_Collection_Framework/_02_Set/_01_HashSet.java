package _13_Collection_Framework._02_Set;

/*
HashSet does not follow insertion order
duplicates element does not allow in set
only single null value can allow to add in set
heterogeneous type of element that allow in set
HashSet follow hash table structure to store the element
// you can not iterate through list iterator over set classes
 */

import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSet
{
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(11);
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(null);
        hs.add(null);

        hs.add("Good");

        System.out.println(hs); // duplicate values are removed in set

        System.out.println("Print all values : ");
        Iterator i = hs.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
