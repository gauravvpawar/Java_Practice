package _13_Collection_Framework._03_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class _02_ArrayDeque
{
    public static void main(String[] args) {
        /*
        ArrayDeque implement the deque interface also the queue interface
        no null value are allow in arrayDeque
        // queue follow first in first out
         */

        Deque aq = new ArrayDeque();

        aq.offer(11);
        aq.offer(22);
        aq.offer(33);
        aq.add("A"); // heterogeneous type of data are allowed but not to be null

//        aq.offer(null);// no null value

        System.out.println(aq);

    }
}
