package _01_List._02_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo
{
    public static void main(String[] args) {
        /*
        Linked list it follow to store data by doubly linked list
        -- you cant search data through  the indexing
        -- insertion and deletion is easy  in linked list
        -- it also contain hetero genus type of data
         */

        LinkedList ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add("Hello");
        ll1.add(30);

        Iterator i1 = ll1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        LinkedList ll2 = new LinkedList();
        ll2.add(100);
        ll2.add(200);
        ll2.add(300);
        ll2.addAll(ll1);

        Iterator i2 = ll2.iterator();
        while (i2.hasNext())
        {
            System.out.println(i2.next());
        }
    }
}
