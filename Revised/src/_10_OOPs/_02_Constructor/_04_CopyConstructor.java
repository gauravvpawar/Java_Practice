package _10_OOPs._02_Constructor;

// Copy Constructor
// copy constructor is used to initialize the object by copying one value from another object
// to copying the details of person

class Passport
{
    String name;
    int age;
    String country;

    Passport(String name , int age , String country)
    {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // copy constructor
    Passport(Passport p1)
    {
        name = p1.name;
        age = p1.age;
        country = p1.country;
    }

    void printInfo()
    {
        System.out.println("name : " + name);
        System.out.println("age : " +age);
        System.out.println("country : " + country);
    }
}
public class _04_CopyConstructor
{
    public static void main(String[] args) {
        Passport p1 = new Passport("Gaurav" , 22 , "India");
        p1.printInfo();

        System.out.println("Passport renew : ");
        Passport p2 = new Passport(p1);
        p2.printInfo();

    }
}
