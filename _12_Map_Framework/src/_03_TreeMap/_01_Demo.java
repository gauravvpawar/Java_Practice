package _03_TreeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        TreeMap follow all the key value is same data type
        - no null values is present
        - it follow binary search tree data type
        - it follow sorted order data
        - it does not maintain insertion order
        -  it does not allow duplicate keys
         */

        TreeMap tm = new TreeMap();
        tm.put(1 , "Gaurav");
        tm.put(3 , "Umesh");
        tm.put(6 , "Ganesh");
        tm.put(2 , "Rahul");

        System.out.println(tm);


//        tm.put(null , "Hello"); you cant

        Set s1 = tm.entrySet();
        Iterator i1 = s1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }


    }
}
