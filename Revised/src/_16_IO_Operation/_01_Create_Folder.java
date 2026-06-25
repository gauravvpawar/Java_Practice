package _16_IO_Operation;

import java.io.File;

public class _01_Create_Folder
{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\Revised\\src\\_16_IO_Operation\\NewFolder");
        System.out.println(f.exists()); // exist check given folder is exist or not

        // to create a folder by using mkdir
        f.mkdir();
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath()); //  we can get full path as well
    }
}
