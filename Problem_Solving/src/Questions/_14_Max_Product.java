package Questions;

public class _14_Max_Product
{
    public static void main(String[] args) {
        System.out.println(maxProduct(267));
        // max product -> 2 * 6 => 12
        // 2* 7 = 14
        // 6 * 7 = 42
        //42 is largest product of two
    }

    public static int maxProduct(int n) {
        int mx1 = 0 , mx2 = 0;

        while (n > 0)
        {
            int rem = n% 10;

            // it works for 87
            if(rem > mx1)
            {
                mx2 = mx1;
                mx1 = rem;
            }
            else if(rem > mx2) // e.g 23 it 2 is lesser than 3
            {
                mx2 = rem;
            }

            n /= 10;
        }

        return mx1 * mx2;
    }
}
