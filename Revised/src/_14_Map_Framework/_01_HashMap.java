package _14_Map_Framework;

/*
Map framework it behind it same work like set classes
map contain data in key and values
it does not have any duplicate key
it does not follow insertion order
it follow hashtable data structure
 */

import java.util.*;

public class _01_HashMap
{
    public static void main(String[] args) {
        HashMap hs = new HashMap();
        hs.put(11, "abc");
        hs.put(2,"cde");
        hs.put(3 , "def");
        hs.put(null , "xyz"); // you can add single null value in key
        // duplicate key is not valid

//        to print all values from map
        System.out.println(hs); //  it prints the map

        // we can convert map to set
        Set s = hs.entrySet();
        Iterator i =s.iterator();
        while (i.hasNext())
        {
            // to print each key and value
            Map.Entry ele = (Map.Entry) i.next();
            System.out.println(ele.getKey() + " : " + ele.getValue());
        }
    }
}
