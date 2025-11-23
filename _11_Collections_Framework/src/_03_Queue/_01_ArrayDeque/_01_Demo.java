package _03_Queue._01_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        ArrayDeque -> it Implement deque interface and queue interface
        It follow first in first out data structure
        -you can add heterogeneous type of data
        - it follow insertion order
        - you can only insert element at last and at the end of queue
         */

        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(100);
        ad.add(50);

        System.out.println(ad);

//        ad.add(null); you cant enter null value
        ad.add("Hello");

        Iterator i1 = ad.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
