import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _02_Methods_Chaining
{
    public static void main(String[] args) {

        List<Integer> al1 = Arrays.asList(10 , 20 ,30 , 40);
        System.out.println(al1);
        Stream<Integer> st1 = al1.stream();
        st1.forEach(n -> System.out.println(n));
        System.out.println("-----------------------------------------After Action ----------------------------");
        Stream<Integer> st2 = al1.stream();
        Stream <Integer> st3 = st2.sorted().
                filter(n -> n % 8 == 0)
                .map(n -> n*2);
        st3.forEach(n -> System.out.println(n));
    }
}
