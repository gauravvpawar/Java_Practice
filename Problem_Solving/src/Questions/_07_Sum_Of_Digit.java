package Questions;

//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
// sum of digit

public class _07_Sum_Of_Digit
{
    public static void main(String[] args) {
        System.out.println(sumOfDigits(687));
    }


    static int sumOfDigits(int n) {
        // code here
        int sum = 0;

        while(n > 0)
        {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }
}
