package _01_Exception_Occur._02_Unchecked_Exception;

public class Demo
{
    public static void main(String[] args) {
        /*
        unchecked exception occur during the compile time
         */

        int arr[] = {10 , 20 , 30 , 40 , 50};

        System.out.println(arr[1]);
        System.out.println(arr[6]);// this line gives exception

        System.out.println("Code ended");// abruptly terminate the below code also
    }
}
