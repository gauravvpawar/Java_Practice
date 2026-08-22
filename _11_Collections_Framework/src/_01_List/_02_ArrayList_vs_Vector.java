package _01_List;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class _02_ArrayList_vs_Vector
{
    public static void main(String[] args) {
        // Arraylist
        // arraylist is not legacy class
        // arraylist is not thread safe
        // arraylist was introduce in collection framework
        // arraylist we can get object through index
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);

        // vector
        // vector is legacy class
        // vector is introduced in java 1.0
        // vector is thread safe
        // means it is synchronised it can access the multiple object at same time
        // vector is slow as compare to arraylist
        Vector<Integer> vector = new Vector<>();
        vector.add(11);
        vector.add(22);
        vector.add(33);
        System.out.println(vector);

        ListIterator li = vector.listIterator();
        while (li.hasNext())
            System.out.println(li.next());

        // for both arraylist and vector we can iterate through forward and backward using listIterator
    }
}
