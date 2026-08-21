import java.util.ArrayList;
import java.util.Random;

public class _03_Parallel_Stream
{
    public static void main(String[] args) {
        // to print the sum of all element of arraylist
        // if the list is might large, and you add all element sum

        ArrayList<Integer> al = new ArrayList<>(10000);

        // we add the random number element and check which way we can print the sum quickly
        Random ran = new Random();
        for(int i = 0;i<10000;i++)
        {
            al.add(ran.nextInt(100)); // we can set the bound
        }

        int sum1 = al.stream().map(n  -> n * 2)
                .reduce(0 , (c, e) -> c + e);


        int sum2 = al.stream()
                        .map(e -> e * 2)
                                .mapToInt(i -> i)
                                        .sum(); // it return sum by method

        System.out.println(sum1);
        System.out.println(sum2);

        int sum3 = al.parallelStream().map(e -> e*2)
                .mapToInt(i -> i)
                .sum();

        // by parallel Stream we can use the collection object on multiple thread
        System.out.println(sum3);
        //System.out.println(al);

    }
}
