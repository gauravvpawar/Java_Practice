package _01_HashMap;

import java.util.HashMap;
import java.util.HashSet;

class Student
{
    private String name;
    private int age;
    private String subject;

    Student(String name , int age , String  subject)
    {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public String toString()
    {
        return name + " " + age + " " + subject;
    }
}

public class _02_Fetching_Class_Object_Hashmap
{
    public static void main(String[] args) {
        /*
        to fetch class object in hashmap
         */

        Student s1 = new Student("Umesh" , 22 , "Java");
        Student  s2 = new Student("Kiran" , 25 , ".net");
        Student s3 = new Student("Shivam", 24 , "Python");

        HashMap hs = new HashMap();
        hs.put(1 ,s1 );
        hs.put(2 , s3);
        hs.put(3 , s2);

        System.out.println(hs);
    }
}
