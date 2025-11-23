import java.util.*;

public class Demo
{
    public static void main(String[] args) {
        /*
        Behind the map framework it works set interface it contain
        HashMap  , LinkedHashMap , TreeMap
        It store key and value type data
        -- it does not sorted order
        it does not contain duplicate key and value can be duplicate
         */

        LinkedHashMap lh1 = new LinkedHashMap();
        lh1.put(4 , "gaurav");
        lh1.put(3, "Umesh");
        lh1.put(2 , "Rahul");
        lh1.put(1, "Ganesh");

        //it print the key value object
        System.out.println(lh1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target key : ");
        int target = sc.nextInt();

        Set s  = lh1.entrySet();
        Iterator i1 = s.iterator();

        while (i1.hasNext())
        {
//            System.out.println(i1.next());

            Map.Entry ip = (Map.Entry) i1.next();
            if((int)ip.getKey()== target)
            {
                System.out.println("value of key : " + ip.getValue());
            }
        }
    }
}
