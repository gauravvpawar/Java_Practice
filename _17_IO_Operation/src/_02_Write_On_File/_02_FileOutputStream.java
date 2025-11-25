package _02_Write_On_File;

import java.io.File;
import java.io.FileOutputStream;

public class _02_FileOutputStream
{
    public static void main(String[] args) {
        /*
        By Using fileOutputStream you can also write on file
         */

        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_02_Write_On_File\\Code");
        System.out.println(folder.exists());
        folder.mkdir();
        System.out.println(folder.exists());

        // after create folder create a file
        File file = new File(folder , "Sample.txt");
        System.out.println(file.exists());
        try
        {
            file.createNewFile();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(file.exists());

        try
        {
            FileOutputStream f1 = new FileOutputStream(file); // it also throw file not found Exception
//            f1.write(); it only  accept int or byte array

            String str = "Welcome to the india";
            byte b[] = str.getBytes();
            f1.write(b);

            String str2 = "My Name is Gaurav";
            f1.write(str2.getBytes());
            f1.close();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
