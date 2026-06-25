package _16_IO_Operation;

import java.io.File;

public class _02_Create_File_in_Folder
{
    public static void main(String[] args) {
        /*
        first check the given folder is exist or not if it is not then have to create the folder
        then inside folder create a file
         */

        File f = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\Revised\\src\\_16_IO_Operation\\NewFolder\\");
        System.out.println(f.exists());

        // to create file
        File f2 = new File(f , "Demo.txt");
        System.out.println(f2.exists());
        try{
            f2.createNewFile();
        }catch (Exception e)
        {
            System.out.println("Exception occur");
        }

        System.out.println(f2.exists());


    }
}
