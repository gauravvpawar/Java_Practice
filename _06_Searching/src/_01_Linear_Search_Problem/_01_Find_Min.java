package _01_Linear_Search_Problem;

// in the  given array find the minimum of array

public class _01_Find_Min
{
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};

        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Minimum : " + min);
    }
}
