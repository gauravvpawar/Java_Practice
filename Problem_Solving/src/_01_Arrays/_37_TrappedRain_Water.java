package _01_Arrays;

import java.util.Arrays;

public class _37_TrappedRain_Water
{
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        _37_TrappedRain_Water obj = new _37_TrappedRain_Water();
        System.out.println(obj.trap(arr));
    }

    public int trap(int[] height) {
        int n = height.length;
        // two auxiliary helper array to find left Max and right Max
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        for(int i = 1;i<n;i++)
        {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));

        int trappedCount = 0;
        for(int i = 0;i<n;i++)
        {
           trappedCount =  trappedCount +  Math.min(leftMax[i] , rightMax[i]) - height[i];
        }

        return trappedCount;
    }

}
