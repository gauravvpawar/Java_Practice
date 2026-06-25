package _16_IO_Operation;

import java.io.File;
import java.io.FileWriter;

public class _03_Write_In_File
{
    public static void main(String[] args) {
        // first to get the folder
        File f = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\Revised\\src\\_16_IO_Operation\\NewFolder\\");
        System.out.println(f.exists());// check the given folder exist or not

        // to fetch the file
        File file = new File(f , "Demo.txt");
        System.out.println(file.exists()); // true

        // throw exception whether the file is exist or not
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("This is java file operation");
            fw.write("We are writing in demo.txt file");
            fw.close();
        }catch (Exception e)
        {

        }

        System.out.println("Successfully written in file");
    }
}
