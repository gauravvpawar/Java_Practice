package _10_OOPs._07_Super_Keyword;

// super is also used for to call the parent constructor while the object is creating

class Student
{
    String name;
    String profession;

    Student(String name , String profession)
    {
        this.name = name;
        this.profession = profession;
    }

    void printInfo()
    {
        System.out.println("name : " + name);
        System.out.println("Profession :"+ profession);
    }

}

class Employee extends Student
{
    Employee(String name , String profession)
    {
        super(name , profession);// this called the parent constructor first
    }

    void printInfo()
    {
        super.printInfo();
        System.out.println("Now he become associate Software developer ");
    }
}


public class _03_Super_Constructor
{
    public static void main(String[] args) {
    Employee e = new Employee("Rohan" , "Software developer");
    e.printInfo();
    }
}
