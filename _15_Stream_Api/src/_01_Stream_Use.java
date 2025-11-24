import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _01_Stream_Use
{
    public static void main(String[] args) {
        /*
        Stream api introduce in java 8
        Stream api have multiple function to perform on object
        when once object get consume of stream you have to create one
         */

        List<Integer> al1 =  Arrays.asList(10 , 20, 30 , 40);
        Stream<Integer> st1 = al1.stream();

        st1.forEach(n -> System.out.println(n));

        //  once the stream consume you cant perform any task again
//        Stream<Integer> st2 = st1.map(n -> n * 2);
//        System.out.println(st2);



    }
}
