package _11_Exception_Handeling._01_Checked_Exception;

// checked Exception occur during the compile time
// checked exception is also called compile time exception
// without handle try and catch you cannot compile the program for checked Exception

import java.io.FileReader;

public class Main
{
    public static void main(String[] args) {

        // you have to handle the checked Exception
        // using try and catch
        // it includes error like file not found , IO exception
        try
        {
            FileReader fr = new FileReader("./Demo.txt");// it gives compilation error
            System.out.println("File oven successfully");
        }
        catch (Exception e)
        {
            System.out.println("Handle the exception");
        }

    }
}
