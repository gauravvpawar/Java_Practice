package _11_Exception_Handeling._03_Exception_Handeling._02_Using_Try_Catch_Finally;

public class _03_Multiple_Catch_Block
{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        String name = null;

        try
        {
          System.out.println(arr[9]); // when you exception occur first then it throws first exception
            System.out.println(name.length());

        }catch (NullPointerException e)
        {
            System.out.println("Exception occur due to name value is null");
        }catch (ArithmeticException e)
        {
            System.out.println("Exception occur due to number divide by zero");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are finding element beyond the range");
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Closing the connections");
        }

        System.out.println("Done !");
    }
}
