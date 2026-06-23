package _13_Collection_Framework._02_Set;

/*
Tree set follow binary search tree data structure
in TreeSet heterogeneous type of element are not allowed
duplicate values are not allowed
tree set does not maintain insertion order
it sort using binary search tree
TreeSet Implement Navigable set and SortedSet
SortedSet
    |
NavigableSet
    |
TreeSet

 */

import java.util.Iterator;
import java.util.TreeSet;

public class _03_TreeSet
{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(40);
//        ts.add(null);// it gives runtime error

        System.out.println(ts);

        System.out.println("----------------------------------- to print all values from treeSet----------------------");
        Iterator i = ts.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }

}
