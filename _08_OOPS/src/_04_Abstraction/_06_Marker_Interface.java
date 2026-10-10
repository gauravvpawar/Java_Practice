package _04_Abstraction;

// interface we dont have any abstract method
// this interface is known as marker interface
interface Serializable
{

}

class Student implements Serializable
{
    String name = "abc";
}

public class _06_Marker_Interface
{
    public static void main(String[] args) {
        Student s = new Student();
        // we can check the relation of marker interface
        if(s instanceof Serializable)
        {
            System.out.println("student is marked serializable");
        }
    }
}
