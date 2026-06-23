package _13_Collection_Framework._02_Set;
/*
Linked hashSet it is the combination of hash set and linked list
it store order of element
no duplicates value are stored in linkedHash set
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _02_Linked_HashSet
{
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();

        ls.add(101);
        ls.add(202);
        ls.add(303);
        ls.add(404);
        ls.add(null);
        ls.add(null); // duplicate element does not add
        ls.add(10000);
        ls.add("Hello");//  it stores heterogeneous type of element

        System.out.println(ls);

        System.out.println("------------------------ print each element one by one-------------------------------------");
        // through iterator
        Iterator i = ls.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
