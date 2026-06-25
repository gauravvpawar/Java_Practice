package _16_IO_Operation;

/*
Using the file input stream we can read data from file
 */

import java.io.File;
import java.io.FileInputStream;

public class _06_File_Input_Steam
{
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\Revised\\src\\_16_IO_Operation\\NewFolder\\");

        System.out.println(folder.exists());

        // check the given file exist in folder
        File file = new File(folder , "Test.txt");
        System.out.println(file.exists());

        try {
            FileInputStream fn = new FileInputStream(file);
            int idx = fn.read();

            while (idx != -1)
            {
                System.out.print((char)(idx));
                idx = fn.read();
            }
        }catch (Exception e)
        {

        }
    }
}
