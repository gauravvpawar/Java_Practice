package Questions;

/*
Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7
 */

public class _08_Print_Kth_Digit
{

    // best approach
    static long kthDigit(int a, int b, int k) {
        // code here
        long ans = 1;

        // first find power of number
        for(int i = 1;i<=b;i++)
        {
            ans = ans * a;
        }

        // for k the value
        for(int j = 1 ; j<k;j++)
        {
            ans /= 10;
        }

        return ans % 10;
    }

    public static void main(String[] args) {
//        System.out.println(kthDigit(11 , 11 ,1));
        System.out.println(kthDigit(3,3,1));
//        System.out.println(anotherOne(11,11,1));
    }


    static long anotherOne(int a, int b, int k) {
        // code here

        int findPower = findPow(a , b);
        int count = 0;
        long ans = 0;
        while (findPower > 0)
        {
            int rem = findPower % 10;
            count++;
            if(count == k)
            {
                ans = rem;
            }
            findPower /= 10;
        }
    return ans;
    }

    public static int findPow(int a , int b)
    {
        int ans = 1;
        for(int i = 1;i<=b;i++)
        {
            ans = ans * a;
        }

        return ans;
    }
}
