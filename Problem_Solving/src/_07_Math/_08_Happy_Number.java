package _07_Math;

class Solution2 {
    public boolean isHappy(int n) {
        while(n >= 9)
        {
            int sum = 0;
            while(n > 0)
            {
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }

            if(sum != 1)
            {
                n = sum;
            }
        }

        return n == 1;
    }
}


public class _08_Happy_Number
{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isHappy(19));
    }
}
