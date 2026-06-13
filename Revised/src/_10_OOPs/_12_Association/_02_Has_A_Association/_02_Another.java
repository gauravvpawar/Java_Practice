package _10_OOPs._12_Association._02_Has_A_Association;

class Address
{
    String place;
    int pinCode;
    String district;

    Address(String place , int pinCode , String district)
    {
        this.place = place;
        this.district = district;
        this.pinCode = pinCode;
    }
}

class Person
{
    String name;
    String dob;
    int age;
    Address a;

    Person(String name , String dob , int age , Address a)
    {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.a = a; // you have to provide the values of address object
    }

    void showInfo()
    {
        System.out.println(name);
        System.out.println(dob);
        System.out.println(age);
        System.out.println(a.place);
        System.out.println(a.district);
        System.out.println(a.pinCode);
    }

}

public class _02_Another
{
    public static void main(String[] args) {
    Address a = new Address("swargate" , 411099 , "Pune");
    Person p = new Person("Vivek" , "15March2000",35 ,a );

    p.showInfo();

    }
}
