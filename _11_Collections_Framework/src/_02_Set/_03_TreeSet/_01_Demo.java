package _02_Set._03_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        TreeSet -> it follow Binary search tree order
        - it does not allowed the duplicate number
        - it does not allow null value
        - it does not allow to store heterogeneous type  data
        - it maintain the sorted order
        - it implement two interface sortedset and navigableSet
         */

        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(9);
        ts.add(55);
        ts.add(89);
        ts.add(45);

        System.out.println(ts);

//        ts.add(null); // it show null time exception at compile time
//        ts.add("Hello");// it throws compile time exception

        Iterator i1 = ts.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
