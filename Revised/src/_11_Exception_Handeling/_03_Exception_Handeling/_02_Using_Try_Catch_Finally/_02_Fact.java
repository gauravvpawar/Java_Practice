package _11_Exception_Handeling._03_Exception_Handeling._02_Using_Try_Catch_Finally;

public class _02_Fact
{
    public static void main(String[] args) {
        // in exception you can directly write the finally block after writing the try block
        // even if you dont write the catch block for the exception

        String name = "gaurav";

        try {
            System.out.println(name.length()); // cant find the null length
        }
        finally {
            System.out.println("This part run always"); // but exception shows in console
        }

        System.out.println("Done !");
    }
}
