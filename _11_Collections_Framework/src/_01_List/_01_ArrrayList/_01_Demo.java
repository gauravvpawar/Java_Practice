package _01_List._01_ArrrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Arraylist it is class in collection framework
        - in arraylist we can contain the hetro geneous type data
        - we can directly access through indexing
        - array list it contain auto resizing
        - it follow sequence
        - it allow to add duplicate number
        - it store all element like a object
         */

        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al1.add('a');
        al1.add('b');
        al1.add("Hello");

        System.out.println(al1); // it print the all object

        for(int i = 0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }

        // collection interface have iterator interface we can iterate array forward
        // through the list iterator we can iterate arraylist forward as well as backward

        Iterator i1 = al1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        System.out.println("-----------------------------");
        ListIterator li1 = al1.listIterator();
        while (li1.hasNext()) {
            System.out.println(li1.next());
        }

        System.out.println("-----------------------In reverse---------------------------");
        while (li1.hasPrevious())
        {
            System.out.println(li1.previous());
        }
    }
}
