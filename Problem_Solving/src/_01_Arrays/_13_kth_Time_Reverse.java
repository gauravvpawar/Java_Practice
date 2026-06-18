package _01_Arrays;

// kth time reverse an array with using another array

public class _13_kth_Time_Reverse
{
    public static void main(String[] args) {
        int arr[] = {1 , 2, 3 , 4 ,5 ,6};

        int ans[] = rotateArray(arr , 2);

        printArray(ans);
    }

    public static int[] rotateArray(int arr[] , int k)
    {
        int j = 0;
        int n = arr.length;
        int ans[] = new int[n];

        // for first fill the n - k element
        for(int i = n-k;i<n;i++)
        {
            ans[j] = arr[i];
            j++;
        }

        // to fill the element from start
        for(int l = 0;l<n-k;l++)
        {
            ans[j] = arr[l];
            j++;
        }

        return ans;
    }

    public static void printArray(int arr[])
    {
        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
