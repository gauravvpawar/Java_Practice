package _07_Math;

class Solution {
    public boolean isStrong(int n) {
        // code here
        int temp = n;
        int sum = 0;
        while(temp > 0)
        {
            int rem = temp % 10;
            sum += findFact(rem);
            temp /= 10;
        }

        return sum == n;
    }

    public int findFact(int x)
    {
        int fact = 1;
        for(int i = 2;i<=x;i++)
        {
            fact = fact * i;
        }
//        System.out.println(fact);
        return fact;
    }
}


public class _06_Strong_Number {
    public static void main(String args[])
    {
        Solution s1 = new Solution();
        System.out.println(s1.isStrong(145));
    }


}
