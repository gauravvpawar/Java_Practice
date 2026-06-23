package _01_Arrays;

//https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array

import java.util.Arrays;

public class _20_Plus_One
{
    public static void main(String[] args) {
//        int arr[] = {1,2 ,9};
        int arr[] = {9};
        int ans[] = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;

    }
}
