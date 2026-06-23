package _13_Collection_Framework._03_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class _03_Priority_Queue
{
    public static void main(String[] args) {
        /*
        Priority queue direct implement queue interface
        priority queue follows min heap data structure
        You can not enter null values
        it maintain insertion order
        duplicated data are allowed
         */

        Queue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        System.out.println(pq);
        pq.add(4);
//        pq.add(null); you cant

        System.out.println(pq);
//        pq.add("Queue"); // you have to always assing first which data you want to store
        System.out.println(pq);
    }
}
