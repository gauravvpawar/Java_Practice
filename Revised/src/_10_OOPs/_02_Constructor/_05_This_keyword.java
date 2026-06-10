package _10_OOPs._02_Constructor;

// this key word refers to the current object

class Pen
{
    int amount;
    String color;


    Pen(int amount , String color)
    {
        // while you assigning value of object this refers for the object values
        this.amount = amount;
        this.color = color;
    }

    void printInfo()
    {
        System.out.println("color : " + color + " pen amount : " + amount);
    }
}

public class _05_This_keyword
{
    public static void main(String[] args) {
        Pen p1 = new Pen(10 , "Blue");

        p1.printInfo();
    }
}
