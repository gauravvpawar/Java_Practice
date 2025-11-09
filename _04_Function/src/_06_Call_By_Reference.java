import java.util.Arrays;

public class _06_Call_By_Reference
{
    public static void main(String[] args) {
        /*
            call by reference when you perform some action on the variable it directly reflect changes on the  variable
            it mostly on the non-primitive data type
            it pass the reference value of the variable
         */

        int arr[] = { 10 , 20 , 30, 40 , 50};
        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));

        action(arr);

        System.out.println("After passing the object of var");
        System.out.println(Arrays.toString(arr)); // it directly reflect on the varible
    }

    static void  action(int arr[])
    {
        arr[0] = 100;
    }
}
