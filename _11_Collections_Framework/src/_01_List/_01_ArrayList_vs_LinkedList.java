package _01_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _01_ArrayList_vs_LinkedList
{
    public static void main(String[] args) {
        // ArrayList
        // Arraylist it follow insertion order
        // arraylist follow autogrow
        // default size of arraylist is 10
        // arraylist follow index based searching
        // in arraylist we can store homogeneous type of element
        // insertion and deletion in array makes complex
        // arraylist can allow duplicate value
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);
        System.out.println(al);

        // in arraylist we can fetch element through index we have get method
        for(int i = 0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        //LinkedList
        // linkedList also follow insertion order
        // LinkedList follow doubly linked list
        // Doubly liked list make linkedList insertion and deletion operation easy
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(10);
//        ll.remove(10);
//        ll.remove(1);
        System.out.println(ll);

        // for linked list we can get all element through iterator
        Iterator i = ll.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        // all the list class element we can fetch through list Iterator
        // by list iterator we can travel list in forward and backward as well
        ListIterator ii = al.listIterator();
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }

        System.out.println("-----------------------------we can travel array backword-------------------------");
        while (ii.hasPrevious())
        {
            System.out.println(ii.previous());
        }
    }
}
