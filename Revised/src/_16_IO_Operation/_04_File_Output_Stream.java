package _16_IO_Operation;

/*
FIle output stream through we can also write in the file
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_File_Output_Stream
{
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\Revised\\src\\_16_IO_Operation\\NewFolder\\");
        System.out.println(folder.exists());

        File file = new File(folder, "Test.txt");
        System.out.println(file.exists());
        try {
            file.createNewFile(); // check the any problem occur while creating file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.exists());
        // to check the file is exist or not
        try{
            FileOutputStream fw = new FileOutputStream(file);
            String words = "Welcome to the real world";
            byte b[] = words.getBytes();
            fw.write(b);
            System.out.println("Successfully write in the file");
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done program");
    }
}
