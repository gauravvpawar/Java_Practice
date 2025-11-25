package _01_Achieve_Serialization;

import javax.swing.text.Style;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.management.ThreadInfo;

class Student implements Serializable
{
    private String name;
    private int age;
    private int standard;

    Student(String name , int age , int standard)
    {
        this.name = name;
        this.age = age;
        this.standard = standard;
    }


    public void show()
    {
        System.out.println(this.name + " " + this.age + " " + this.standard);
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        To achieve serialization
        Serialization  - converting object into byteStream
         */

        Student s1 = new Student("Umesh" , 25,12);
        Student s2 =  new Student("Ganesh" , 26, 10);

        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_18_Serialization\\src\\_01_Achieve_Serialization\\Source");
        folder.mkdir();

        File file = new File(folder , "Sample.txt");
        try {
            file.createNewFile();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }

        // to achieve byte code store in file
        try
        {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.writeObject(s2);

            System.out.println("Data Passed");
            oos.close();

        }catch (Exception e)
        {
            System.out.println("Error occur" + e);
        }





    }
}
