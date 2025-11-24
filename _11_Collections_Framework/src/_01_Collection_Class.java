import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _01_Collection_Class
{
    public static void main(String[] args) {
        /*
         Collection class contain the predefine static method we Can perform on all collection framework classes
         Contains only static methods.
           Contains only static methods. Helps with:
           sorting
            searching
            reversing
            shuffling
            min/max
            finding
             thread-safe wrappers creating immutable collections
         */

        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(9);
        al1.add(2);

        System.out.println(al1);

        Collections.sort(al1);// it perform changes is mutability current object
        System.out.println(al1);
        int ans = Collections.binarySearch(al1 , 2);
        System.out.println(ans);

        System.out.println(al1.reversed()); // it perform immutable changes
        Collections.reverse(al1);
        System.out.println(al1);
    }
}
