package _04_Function;

public class _06_CallByReference
{
    public static void main(String[] args) {
        // int call by reference changes make in the original one value
        int arr[] = {10 , 20 , 30};
        System.out.println(arr[1]);
        change(arr); // both pointing towards same object

        System.out.println(arr[1]);
    }

    public static void change(int array[])
    {
        array[1] = 200;
    }
}
