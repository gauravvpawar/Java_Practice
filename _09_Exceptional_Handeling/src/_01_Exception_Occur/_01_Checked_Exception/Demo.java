package _01_Exception_Occur._01_Checked_Exception;

import java.io.FileReader;

public class Demo
{
    public static void main(String[] args) {
        // file reader throws exception like file not found during compile time exception
        // that why we need to provide try catch block
        try
        {
        FileReader file = new FileReader("./Hello.txt");
        System.out.println("File open successfully");

        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");
    }
}
