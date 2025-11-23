package _03_Queue._02_PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        - it follow the min heap data structure
        - it does not follow insertion order
        - you can not add number in index wise
        - you can not add null value
         */

        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        System.out.println(pq);

//        pq.add(null); you cant
//        pq.add("hello"); // you cant add string also

        Iterator i1 = pq.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
