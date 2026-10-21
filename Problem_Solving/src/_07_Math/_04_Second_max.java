package _07_Math;

public class _04_Second_max
{
    public static void main(String[] args) {
        int arr[] = {1 , 2, 3 , 4, 5};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int smax = -1;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                smax = max;
                max = arr[i];
            }

            else if(arr[i] > smax && arr[i] != max)
            {
                smax = arr[i];
            }
        }

        return smax;
    }
}
