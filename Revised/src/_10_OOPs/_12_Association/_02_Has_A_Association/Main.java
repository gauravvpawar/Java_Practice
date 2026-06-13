package _10_OOPs._12_Association._02_Has_A_Association;

// has a relationship
// it provide loose coupling between two class
// only limited properties can access which you need from parent class

class Teacher
{
    void info()
    {
        System.out.println("Living its own life");
    }

    void teaching()
    {
        System.out.println("Master in programming and teaching some student");
    }
}

class Student
{
    // to access some properties of teacher to create the variable of teacher
//    Teacher t; you can not access methods through this direct it just create reference of the classs
    Teacher t = new Teacher();

    void info()
    {
        System.out.println("Living student its own life");
    }


}
public class Main
{
    public static void main(String[] args) {
        Student s = new Student();
        s.t.teaching(); // to accessing properties from parent class
    }
}
