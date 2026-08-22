package _02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _01_HashSet_LinkedHashSet_TreeSet
{
    public static void main(String[] args) {
        // Hashset follow hashtable structure
        // in hashset does not allow duplicate value
        // if you add duplicate value it just update the value
        // only single null value can allow to store in hashset
        // hashSet does not maintain the insertion order
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(100);
        System.out.println(hs);
        // to fetch the each object value in hashset by using iterator
        Iterator i1 = hs.iterator();

        while (i1.hasNext())
            System.out.println(i1.next());

        // LinkedHashSet
        // in linkedHashset it follow hashtable and doubly linkedList
        // LinkedHashSet follow insertion order
        // only single null value can store in it
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(11);
        lh.add(22);
        lh.add(33);
        System.out.println(lh);

        //Treeset maintain object in sorted order
        // treeset follow binary search tree
        // no null value can store in treeset
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1000);
        ts.add(900);
        ts.add(800);
        ts.add(700);

//        ts.add(null); //it throws null pointer exception
        System.out.println(ts);
    }
}
