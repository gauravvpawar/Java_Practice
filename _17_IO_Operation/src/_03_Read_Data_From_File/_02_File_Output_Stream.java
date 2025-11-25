package _03_Read_Data_From_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _02_File_Output_Stream
{
    public static void main(String[] args) {
        /*
        By the file output stream you can print the all data also
         */

        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_03_Read_Data_From_File\\Source2");
        System.out.println(folder.exists());
        folder.mkdir();
        System.out.println(folder.exists());

//      to creating file
        File file = new File(folder , "Sample.txt");
        try
        {
            System.out.println(file.exists());
            file.createNewFile();
            System.out.println(file.exists());
        }catch (Exception e)
        {
            System.out.println("Exception occur while creating file");
        }

        System.out.println(file.exists());

//        to write on file
        try{
            FileOutputStream fl1 = new FileOutputStream(file);
            String str1 = "Java\n";
            String str2 = "DBMS\n";
            String str3 = "Python\n";
            fl1.write(str1.getBytes());
            fl1.write(str2.getBytes());
            fl1.write(str3.getBytes());

            fl1.close();
        }catch (Exception e)
        {
            System.out.println("Exception occur while writing text on file");
        }

//        to read that file
        try
        {
            FileInputStream fl2 = new FileInputStream(file);
            int i = fl2.read();

            while (i != -1)
            {
                System.out.print((char)i);
                 i = fl2.read();
            }
        }catch (Exception e)
        {
            System.out.println("Error occur while reading file");
        }


    }

}
