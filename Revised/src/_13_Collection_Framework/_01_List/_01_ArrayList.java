package _13_Collection_Framework._01_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _01_ArrayList
{
    public static void main(String[] args) {
        // Arraylist is the class in collection framework
        // arraylist is auto resizing type of class
        // in arraylist we can store heterogeneous type of data
        // stores element in insertion order
        // it allow null value to store in arraylist
        // in arraylist we can store multiple null value as well
        // in arrayList we can access the element through index based
        // insertion and deletion of data in arraylist it complex

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add('A');
        al.add("String");

        // to print the all values from arraylist
        System.out.println(al);

        // Inside array list we can access the element through index
        for(int i = 0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        // through iterator interface we can access all element from array
        // iterator interface through we can only go through element  in forward direction
        System.out.println("------------------------- Iterator interface ---------------------------------");
        Iterator i = al.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        // List iterator
        // through list iterator we can fetch all element forward as well as in the backword direction
        // list iterator though we can access all data from the
        // list iterator through which we can access only all list classes
        System.out.println("----------------------------------List Iterator ---------------------------------");
        ListIterator li = al.listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());
        }

        System.out.println("_----------------------------------running backword---------------------------");
        while (li.hasPrevious())
        {
            System.out.println(li.previous());
        }
    }
}
