package _13_Collection_Framework._01_List;

// vector introduced in java 1.0
// vector is legacy class
// vector is synchronised it is thread safe
// vector is slower than array list
// dynamic resizing is in vector

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _03_Vector
{
    public static void main(String[] args) {
        // vector it have contain the duplicate elements in vector class
        // vectors contain heterogeneous type of data
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(null);
        v1.add(null);
        v1.add('a');

        System.out.println(v1);

        // iterator through print the all element from vector
        ListIterator i = v1.listIterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("------------------------ to print value in reverse order------------------------------");
        while (i.hasPrevious())
        {
            System.out.println(i.previous());
        }

        System.out.println("Bye !");
    }
}
