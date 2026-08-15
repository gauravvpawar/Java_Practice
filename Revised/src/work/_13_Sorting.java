package work;

import java.util.Arrays;

public class _13_Sorting
{
    public static void main(String[] args) {
        // bubble
        int arr[] = {50 , 40 , 30 ,20 , 10};

        for(int i = 0;i<arr.length;i++)
        {
            for(int j =0 ;i<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap the number
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
