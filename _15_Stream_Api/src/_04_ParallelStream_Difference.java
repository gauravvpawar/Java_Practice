import java.util.ArrayList;
import java.util.Random;

public class _04_ParallelStream_Difference
{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10000);

        // we add the random number element and check which way we can print the sum quickly
        Random ran = new Random();
        for(int i = 0;i<10000;i++)
        {
            al.add(ran.nextInt(100)); // we can set the bound
        }


        // we can find the actual running time
        // for the  seq normal thread it speed is normal
        // if we provide thread sleep parallel stream in faster as compare to stream
        long startStream= System.currentTimeMillis();

        int sum1 = al.stream()
                .map(n ->
                {
                    try {
                        Thread.sleep(1);
                    }catch (Exception e) {}
                    return n * 2;
                } )
                .mapToInt(i -> i)
                .sum();

        long endStream= System.currentTimeMillis();
        System.out.println(sum1); // we got sum of without parallel stream
        System.out.println("diff : " + (endStream - startStream));

        // by using parallel stream
        long startParaStream= System.currentTimeMillis();
        int sum2 = al.parallelStream()
                .map(n ->
                {
                    try {
                        Thread.sleep(1);
                    }catch (Exception e) {}
                    return n * 2;
                })
                .mapToInt(i -> i)
                .sum();

        long endParaStream= System.currentTimeMillis();

        System.out.println(sum2); //  we got sum using parallel stream
        System.out.println("diff : " + (endParaStream - startParaStream)); // for the thread used parallel stream is more faster
    }

}
