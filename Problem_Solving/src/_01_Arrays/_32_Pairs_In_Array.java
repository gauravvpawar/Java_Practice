package _01_Arrays;

public class _32_Pairs_In_Array
{
    public static void main(String[] args) {
        // to print the pairs in array
        int arr[] = {1 , 2 , 3 , 4  ,5};
        // arr = {1 ,2} {1 , 3 } , {1 , 4} , { 1 , 5}
        //      {2 , 3} ,{2, 4} , {2 , 5}
        //      {3 , 4} , {3 , 5}
        //      {4 , 5}
        // total number of pairs => n(n-1) /2 => 5(4)/2  => 10

        printPairs(arr);
        totalPairs(arr);
    }

    public static void printPairs(int arr[])
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                System.out.print("{" + arr[i] + "," + arr[j] + "}");
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
            for(int j = i+1;j<n;j++)
            {
//                System.out.print("{" + arr[i] + "," + arr[j] + "}");
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}
