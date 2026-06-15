package _11_Exception_Handeling._03_Exception_Handeling._02_Using_Try_Catch_Finally;

// finally block always execute even the exception occur or not
// finally mostly it used for to closing the connection of application

public class _01_Info {
    public static void main(String[] args) {
        try
        {
            String str = null;
            System.out.println(str.length());
        }catch (Exception e)
        {
            System.out.println("Exception occur : " + e); // to print the exception in different ways
            System.out.println(e.toString());
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
//            e.printStackTrace(); // it prints the exact whole details of exception
        }finally {
            System.out.println("Handle the exception successfully");
        }
    }
}
