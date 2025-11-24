package _02_Create_File_Inside_Folder;

import java.io.File;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        To create file inside folder you have to first create folder
         */

        File f = new File( "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_02_Create_File_Inside_Folder\\Source");

        System.out.println(f.exists());
        f.mkdir();

        System.out.println(f.isDirectory());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.exists());

        File f2 = new File(f , "Demo.txt");
        System.out.println(f2.exists());
        try {
            f2.createNewFile();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(f2.exists());
        // to create file inside folder
    }
}
