public class _04_Print_Array_Another_way
{
    public static void main(String[] args) {
        /*
            to print the array
            it called the enhanced for each loop in java
            to take each element and print it
         */

        int arr[] = {10 , 20 , 30 , 40 , 50};
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}
