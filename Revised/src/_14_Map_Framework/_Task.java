package _14_Map_Framework;

// get a map store some demo data
// and print the target key if it is present or else print it not present

import com.sun.nio.sctp.SctpChannel;

import java.util.*;

public class _Task
{
    public static void main(String[] args) {
        LinkedHashMap ls = new LinkedHashMap();
        ls.put(1 ,"abc");
        ls.put(2 ,"def");
        ls.put(3 , "ghi");

        System.out.println(ls);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target key : ");
        int key =  sc.nextInt();

        // to convert first map to set
        Set s = ls.entrySet();

        Iterator i =s.iterator();
        while (i.hasNext())
        {
            Map.Entry ip = (Map.Entry) i.next();
            if((int) ip.getKey() == key)
            {
                System.out.println("Given key : " +ip.getKey() + " value : " + ip.getValue());
            }
        }


    }
}
