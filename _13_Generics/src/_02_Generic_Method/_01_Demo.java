package _02_Generic_Method;

class Test
{
    public <t>void PrintArray(t array[])
    {
        for(int i = 0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        generic method - when class have method that time of assign that method you have to change data type of that method
        It solve by code redundancy
         */

        Test t1 = new Test();
        int arr[] = {10 , 20 , 30 , 40 ,50};// generic method cannot accept the primitive type array
//        t1.PrintArray(arr);

        Integer arr2[] = {10 , 20 , 30 , 40, 50};
        t1.PrintArray(arr2);

//        we Can use for string also
        String str[] = {"Umesh" , "Ganesh" ,"Shivam"};
        t1.PrintArray(str);
    }
}
