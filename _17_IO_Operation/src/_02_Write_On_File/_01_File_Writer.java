package _02_Write_On_File;

import java.io.File;
import java.io.FileWriter;

public class _01_File_Writer
{
    public static void main(String[] args) {
        /*
        File writer it is class have method to write anything on file
        in file we have two class fileWrite and FileOutputStream
        FileWriter it gives runtime exception while you use
        Every time you run code file recreate
         */

        // to create folder
        File f1 = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_17_IO_Operation\\src\\_02_Write_On_File\\Source");
        System.out.println(f1.exists());
        f1.mkdir(); // it creates folder
        System.out.println(f1.exists());
        System.out.println(f1.getName());

        // to create file inside folder
        File file = new File(f1 , "Demo.txt");
        System.out.println(file.exists());
        try {
             file.createNewFile(); // it gives compile time exception
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(file.exists());

//        it also throws exception
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Hello my name is Gaurav");
            fw.write("\n");
            fw.write("Welcome to Java");
            System.out.println("Record saved");

            fw.close(); // you have to always after write on file
        }catch (Exception e)
        {
            System.out.println("Io exception occur");
        }finally {
            System.out.println("Bye");
        }

//        System.out.println(file.length());
    }
}
