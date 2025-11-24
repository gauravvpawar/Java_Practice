package _01_File_Creation;

import java.io.File;

public class _01_Demo
{
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_01_File_Creation\\Demo.txt");

        System.out.println(f1.exists());

//        f1.canExecute();
        try
        {
            f1.createNewFile();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(f1.exists());

        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.getName());

//        you can delete that file also
        f1.delete();
        System.out.println(f1.exists());

    }
}
