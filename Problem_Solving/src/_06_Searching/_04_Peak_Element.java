package _06_Searching;

public class _04_Peak_Element
{
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 2  ,1};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int arr[])
    {
        int start  = 0 , end = arr.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            }else if(arr[mid] > arr[mid +1])
            {
                end = mid;
            }
        }

        return end;
    }
}