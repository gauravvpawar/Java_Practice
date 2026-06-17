package Questions;

/*
Input: n = 1
Output: 2
Explanation: 2 is the first even number in the fibonacci series.
 */
public class _04_nth_Fibonacci_Even_Number
{
    public static void main(String[] args) {
        System.out.println(nthEvenFibonacci(2));
    }
    static int nthEvenFibonacci(int n) {
        // code here
        // fib series -> 0 1 , 2 3, 5 , 8

        int first = 0;
        int second = 1;

        int count = 0;
        int third = 0 ;
        while( true)
        {
            third = first + second;
            first = second;
            second = third;

            if(third % 2 == 0)
            {
                count++;

                if(count == n)
                {
                    return third;
                }
            }
        }

    }

}
