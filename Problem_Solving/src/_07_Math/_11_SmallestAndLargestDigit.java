package _07_Math;

public class _11_SmallestAndLargestDigit
{
    public static void main(String[] args) {
        // find the smallest and largest digit from the number
        int num = 2345;

        int smallest = 9;
        int largest = 0;

        while (num > 0)
        {
            int rem = num % 10;
            if(rem < smallest)
            {
                smallest = rem;
            }

            if(rem > largest)
            {
                largest = rem;
            }

            num /= 10;
        }

        System.out.println(largest + " " + smallest);
    }
}
