package _02_DeSerialization;

import java.io.*;


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
        //to achieve deserialisation


        Student s1 = new Student("Umesh" , 25,12);
        Student s2 =  new Student("Ganesh" , 26, 10);

        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_18_Serialization\\src\\_02_DeSerialization\\Source");
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

        try
        {
            File file2 = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_18_Serialization\\src\\_02_DeSerialization\\Source\\Sample.txt");
            FileInputStream fis = new FileInputStream(file2);

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s3 = (Student) ois.readObject();
            s3.show();

            Student s4 = (Student) ois.readObject();
            s4.show();

        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
