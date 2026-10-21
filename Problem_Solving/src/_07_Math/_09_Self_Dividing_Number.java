package _07_Math;

import java.util.ArrayList;
import java.util.List;

public class _09_Self_Dividing_Number
{
    public static void main(String[] args) {
       int left = 1, right = 22;
        List<Integer> ans = selfDividingNumbers(left , right);
        System.out.println(ans);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = left;i<=right;i++)
        {
            if(isSelfDivide(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean isSelfDivide(int num)
    {
        int temp = num;
        while(temp > 0)
        {
            int rem = temp % 10;
            if(rem == 0 || num % rem != 0)
            {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
