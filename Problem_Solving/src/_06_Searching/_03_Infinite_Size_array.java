package _06_Searching;

// we given infinite size of array
//Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
//Output: 4

public class _03_Infinite_Size_array
{
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(findElement(arr , target));
    }

    // we have to assume the end we didnt given
    public static int findElement(int arr[] , int target)
    {
        int start = 0 , end = 2;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }else if(target > arr[mid])
            {
                start = end + 1;
                end = end * 2;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
