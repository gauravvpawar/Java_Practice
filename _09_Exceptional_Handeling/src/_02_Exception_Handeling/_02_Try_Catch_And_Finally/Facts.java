package _02_Exception_Handeling._02_Try_Catch_And_Finally;

public class Facts
{
    public static void main(String[] args) {
        /*
        finally block does not depend on the catch block
        after try you can write the finally block but if exception occur in try block you have to handle it
         */

        try
        {
            String name = null;
            System.out.println(name.length());
        }
        finally {
            System.out.println("Code ended");
        }

        System.out.println("Bye");
    }
}
