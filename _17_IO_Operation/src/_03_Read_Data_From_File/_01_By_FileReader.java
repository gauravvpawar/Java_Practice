package _03_Read_Data_From_File;

import java.io.*;

public class _01_By_FileReader
{
    public static void main(String[] args)
    {

        /*
        By the file reader it return data in int you have to type cast into character

         */

        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_03_Read_Data_From_File\\Source1");
        System.out.println(folder.exists());
        folder.mkdir();
        System.out.println(folder.exists());

//        to create file
        File  file = new File(folder , "Demo.txt");
        System.out.println(file.exists());
        try
        {
             file.createNewFile();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(file.exists());

//        write on file
    try
    {
         FileWriter fw = new FileWriter(file);
         fw.write("Keep Working\n");
         fw.write("Keep Hustling");
         fw.close();
    } catch (IOException e)
    {
        System.out.println("error occur");
    }

    try
    {
        FileReader fr = new FileReader(file);

//        int i = fr.read();

        // it print the all data
//        while (i != -1)
//        {
//            System.out.print((char) i );
//             i = fr.read();
//        }

        //Second way
        System.out.println("---------------------------------------Another way ---------------------------------------");
        char ch[] = new char[(int)file.length()];

        fr.read(ch);

        for(char data : ch)
        {
            System.out.print(data);
        }

    } catch (IOException e) {
        System.out.println("Error occur while read file" + e);
    }


    }

}
