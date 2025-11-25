package _04_BufferWriter_BufferReader;

import java.io.*;

public class _01_Demo
{
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_04_BufferWriter_BufferReader\\Source");
        System.out.println(folder.exists());
        folder.mkdir();
        System.out.println(folder.exists());

//       create file
        File file = new File(folder , "Sample.txt");

        try
        {
            file.createNewFile();
        }catch (Exception e) {
            System.out.println("Exception occur while creating file");
        }

//        to write on file
        try
        {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello World");
            bw.newLine();
            bw.write("Namaste India");

            bw.close();
        }catch (Exception e)
        {
            System.out.println("Error occur");
        }

        // to read file
        try
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());

            String check = br.readLine();
            while (check != null)
            {
                System.out.println(check);
                check = br.readLine();
            }
//            br.readLine();
//            br.readLine();
        }catch (Exception e)
        {
            System.out.println("Something  went wrong");
        }
    }
}
