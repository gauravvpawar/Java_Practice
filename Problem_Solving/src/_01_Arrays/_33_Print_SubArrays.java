package _01_Arrays;

public class _33_Print_SubArrays
{
    public static void main(String[] args) {
        // print the subArrays
        int arr[] = {1 ,2 ,3 ,4 ,5};
        printSubArray(arr);

        totalPairs(arr);

        // to print the min and max sum of subArray
        subArrayMinMax(arr);
    }

    public static void printSubArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void totalPairs(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                for(int k =i;k<=j;k++)
                {
                }

                count++;
            }
        }

        System.out.println("count : " + count);
    }

    // print the subArray sum min and max
    public static void subArrayMinMax(int arr[])
    {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                int sum = 0;
                for(int k = i;k<=j;k++)
                {
                    sum += arr[k];
                    if(sum > max)
                    {
                        max = sum;
                    }
                }
                if(sum < min)
                {
                    min = sum;
                }
            }
        }

        System.out.println("Min :" + min + " " + "Max : " + max );
    }
}
