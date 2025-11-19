package _02_Exception_Handeling._02_Try_Catch_And_Finally;

public class Demo
{
    public static void main(String[] args) {
        /*
        Finally block is always execute in the  exception handling whether try block hit exception occur the  catch is run
        finally is always run
        finally  generally using for the closing the connection from database or the file reader
         */

        int arr[] = {10  , 20 , 30 , 40, 50};
        try {
            System.out.println(arr[9]);
        }catch (Exception e)
        {
            System.out.println("Out of bound accessing");
        }finally {
            System.out.println("Close code");
        }


        System.out.println("Bye");
    }
}
