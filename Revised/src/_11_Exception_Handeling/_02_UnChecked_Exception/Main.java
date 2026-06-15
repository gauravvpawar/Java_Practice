package _11_Exception_Handeling._02_UnChecked_Exception;

// unchecked Exception occur during execution of program
// it does not show any error occur at compile time


public class Main
{
    public static void main(String[] args) {
        String name = null;

        System.out.println("name length : " + name.length()); // you cant access the length of null string
        // it does not give an exception at compile time it give at runtime exception
        System.out.println("All done");
    }
}
