package _1Dimesion_Array_Problems;

public class _12_Check_Array_Sorted
{
    public static void main(String[] args) {
        // check the given array is sorted or not
        int arr[] = {1 ,2 , 2 ,  4 ,7};
        System.out.println("sorted Array : " +  checkSort(arr));
    }

    public static boolean checkSort(int arr[])
    {
        boolean check = true;
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                check = false;
            }
        }

        return check;
    }
}
