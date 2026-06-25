package _16_IO_Operation;

import java.io.File;
import java.io.FileReader;

public class _05_Read_Data
{
    public static void main(String[] args) {
        // read data from file
        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\Revised\\src\\_16_IO_Operation\\NewFolder\\");
        System.out.println(folder.exists());

        File file = new File(folder , "Test.txt");
        try {
            FileReader fr = new FileReader(file); // it throws exception for the given file exist or not
//            System.out.println(fr.read());

            int idx = fr.read();
            while(idx != -1)
            {
                System.out.print((char)(idx));
                idx = fr.read();
            }
        }catch (Exception e)
        {
            System.out.println("exception occur");
        }

    }
}
