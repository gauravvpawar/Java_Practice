package _07_SearchingTechnique._02_BinarySearch;

public class _01_Main
{
    public static void main(String[] args) {
        int arr[] = {1 , 2, 4 , 6 , 10 , 15 , 18 , 20 , 24};

        int target = 20;

        System.out.println("Target idx : " + binarySearch(arr , target));
    }

    public static int binarySearch(int arr[] , int target)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        int idx = - 1;


        while (start <= end)
        {
            int mid = (start + end) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }else if(arr[mid] < target)
            {
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }

        return idx;
    }
}
