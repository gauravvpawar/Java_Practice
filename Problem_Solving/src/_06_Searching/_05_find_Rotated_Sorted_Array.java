package _06_Searching;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
/*
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
 */
public class _05_find_Rotated_Sorted_Array
{
    public static void main(String[] args) {
//        int arr[] = {4 ,5 ,6 ,7 , 0, 1 , 2};
        int arr[] = {5, 1 ,3};
//        int target = 0;
        int target = 5;
        System.out.println(search(arr , target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);

        if(pivot == -1)
        {
            binarySeach(nums , target, 0 ,nums.length - 1);
        }

        if(nums[pivot] == target)
        {
            return pivot;
        }

        if(target > nums[0])
        {
            return binarySeach(nums , target , pivot - 1 , nums.length-1);
        }

        // search for remaining
        return binarySeach(nums , target , pivot + 1 , nums.length-1);
    }

    public static int findPivot(int nums[])
    {
        int start = 0 ,end = nums.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) /2;
            if(mid < end && nums[mid] < nums[mid+1])
            {
                start = mid + 1;
            }

            if(start < mid && nums[mid] > nums[mid + 1]){
                end = mid;
            }

            if(nums[mid] <= nums[start])
            {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
         }

        return end;
    }

    public static int binarySeach(int arr[] , int target , int start ,int end)
    {
        while (start <= end)
        {
            int mid = start + (end-start) /2;

            if(arr[mid] == target)
            {
                return mid;
            }else if(target < arr[mid])
            {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
