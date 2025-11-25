package _03_Transient_Use;

import java.io.*;

class Student implements Serializable
{
    private String name;
    transient private int age; // transient keyword provide to do not store that variable in serialization
    private String standard;

    Student(String name, int  age , String standard)
    {
        this.name = name;
        this.age = age;
        this.standard = standard;
    }

    public void show()
    {
        System.out.println(name + " : " + age + " : " + standard);
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        by the  transient keyword that variable it wont add in serialization
         */

        Student s1 = new Student("Shivam" , 25 , "Final year");
        Student s2 = new Student("Rahul" , 24 , "Third year");

        File folder = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Java_Practice\\_18_Serialization\\src\\_03_Transient_Use\\Source");
        folder.mkdir();

        File file = new File(folder , "Sample.txt");
        try{
            file.createNewFile();
            System.out.println(file.exists());
        }catch (Exception e)
        {
            System.out.println("Error occur while creating file");
        }

        try
        {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.close();
        }catch (Exception e)
        {
            System.out.println("Exception occur while file writing");
        }

        // to print  the object

        try
        {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s3 = (Student) ois.readObject();
            s3.show(); // you cant access age

            Student s4 = (Student) ois.readObject();
            s4.show();

        }catch (Exception e)
        {
            System.out.println("Exception occur while read file");
        }
    }
}
