package _02_Exception_Handeling._01_Try_catch;

public class Demo
{
    public static void main(String[] args) {
        /*
        we can handle exception by using try catch block
         try -> in try we always write the risky code inside the try if the exception occur in the first line in try
                it crete the  object of that exception throw the exception
         catch -> catch block catch the exception has been thrown by the try block
         // that exception occur during the runtime because we dont want the break the flow of program
         */
//        String name = "gaurav"; // it work fine
        String name = null;
        int arr[] = {10 , 20 , 30 , 40};
        try
        {
            System.out.println(name.length()); // it throws  the object of exception of risky line
            System.out.println(arr[9]);
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
            System.out.println("You cant find length of null string");
        }

        System.out.println("bye");
    }
}
