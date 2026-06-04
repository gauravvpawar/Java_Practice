package _05_Array;

public class _01_ArrayInfo
{
    public static void main(String[] args) {
        // Arrays is the collection of the similar type of element it also as the homogeneous type of data
        // Advantage of array ->>
        /*
            Searching Easily
            Sorting Easily
            Random Accessing of Element
            Code Optimising
         */

        int arr[] = {10 , 20 , 30 , 40 , 50};

        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        // Dis Advantage of Array
        /*
            Fixed sized
            Only we can store homogeneous type element
            Insertion and deletion it takes worst time
            waste of memory if it is remaining
         */

    }
}
