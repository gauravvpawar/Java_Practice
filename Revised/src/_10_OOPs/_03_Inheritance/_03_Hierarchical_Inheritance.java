package _10_OOPs._03_Inheritance;

// in Hierarchical Inheritance
// In it have only one parent class and multiple child class the all child class acquiring all properties of parent
//  class

class Dmart
{
    int pen = 10 ,biscuit = 25 , bottle = 40;
    void showGreeting()
    {
        System.out.println("Welcome to Dmart");
    }
}

class User1 extends Dmart
{
    void buyProducts()
    {
        int count = pen + bottle;
        System.out.println("total price : " + count);
    }
}

class User2 extends Dmart
{
    void buyProducts()
    {
        int count = pen + biscuit;
        System.out.println("Total amount : " + count);
    }
}

public class _03_Hierarchical_Inheritance
{
    public static void main(String[] args) {
        Dmart d = new Dmart();
        d.showGreeting();

        User1 u1 = new User1();
        System.out.println("User 1 amount : ");
        u1.buyProducts();

        User2 u2 = new User2();
        System.out.println("User 2 amount");
        u2.buyProducts();
    }
}
