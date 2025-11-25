package _04_BufferWriter_BufferReader;

import java.io.FileReader;
import java.io.PrintWriter;

public class _02_PrintWriter
{
    public static void main(String[] args) {
        /*
        Through the print writer class we can write the Store the  integer also in file without casting in ascii values
         */

        try
        {
            PrintWriter pw = new PrintWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_04_BufferWriter_BufferReader\\Source\\Sample.txt");
            pw.println("hey whatsApp");
            pw.println("Count down Started : ");
            pw.println(1);
            pw.println(2);
            pw.println(3);
            pw.println(100);

            System.out.println("File created");
            pw.close();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        try
        {
            FileReader fr = new FileReader("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_04_BufferWriter_BufferReader\\Source\\Sample.txt");
            int i = fr.read();
            while (i != -1)
            {
                System.out.print((char)i);
                i = fr.read();
            }
        }catch (Exception e)
        {
            System.out.println("Exception occur");
        }

    }
}
