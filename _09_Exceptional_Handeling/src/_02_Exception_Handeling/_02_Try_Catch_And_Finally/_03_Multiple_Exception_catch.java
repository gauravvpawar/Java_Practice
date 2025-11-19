package _02_Exception_Handeling._02_Try_Catch_And_Finally;

public class _03_Multiple_Exception_catch
{
    public static void main(String[] args) {
        /*
        in try block you can handle the multiple exception but the whenever the exception occur that  throw the exception
        object
         */

        int arr[] = {10 , 20 , 30 , 40  ,50};
        String name = null;
        try
        {
            System.out.println(arr[9]); // exception occur throw the exception object and catch handle the  exception
            System.out.println(name.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("You can divide number by zero " + e.getStackTrace());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You trying to find array idx out of bound" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong" + e.toString());
        }
        finally {
            System.out.println("Always run");
        }
    }
}
