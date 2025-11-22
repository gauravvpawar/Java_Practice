package _01_List._03_Vector;

import java.util.Iterator;
import java.util.Vector;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Vector is legacy classs
        - it is had since 1.0 after the  collection they are add in list
        - it is synchronised class it is thread safe
        - it is slower as compared array list
         */

        Vector v1 = new Vector();
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(null);
        v1.add(null);

        v1.add(10);

        Iterator i1 = v1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
