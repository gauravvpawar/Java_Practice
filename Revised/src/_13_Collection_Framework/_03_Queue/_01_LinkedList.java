package _13_Collection_Framework._03_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _01_LinkedList
{
    public static void main(String[] args) {
        /*
        Linked List it implements the Queue and deque
        it maintain the insertion order
        heterogeneous type of data is valid
         */

        Queue al = new LinkedList();
        al.add("A");
        al.add('B');
        al.add(3);

        System.out.println(al);
        al.offer(null);

        System.out.println(al);
    }
}
