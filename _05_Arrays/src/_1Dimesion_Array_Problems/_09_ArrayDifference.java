package _1Dimesion_Array_Problems;

public class _09_ArrayDifference
{
    public static void main(String[] args) {
        int arr[] = {1,15,6,3};
        int ans = differenceOfSum(arr);
        System.out.println(ans);
    }

    public static int differenceOfSum(int[] nums) {
        int sumOfArray = 0;
        int sumOfDigit = 0;

        for(int ele : nums)
        {
            int temp = ele;
            while(temp > 0)
            {
                sumOfDigit += temp % 10;
                temp /= 10;
            }
            sumOfArray += ele;
        }

//        System.out.println(sumOfArray);
//        System.out.println(sumOfDigit);

        return sumOfArray - sumOfDigit;
    }
}
