package _06_Constructor_Reference;

import java.util.Arrays;
import java.util.List;

class Student
{
    private String name;
    private int age;

    Student(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class _06_Constructor_Reference
{
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Pavan" , "Nitin" , "Umesh");

        List<Student> stud = students.stream()
                .map(Student::new)
                .toList();

        System.out.println(stud);
    }
}
