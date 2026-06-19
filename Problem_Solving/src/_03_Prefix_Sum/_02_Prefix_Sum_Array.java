package _03_Prefix_Sum;

public class _02_Prefix_Sum_Array
{
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 ,4 ,5};
        prefixSum(arr);

        printArray(arr);
    }

    public static void prefixSum(int arr[])
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static void printArray(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
