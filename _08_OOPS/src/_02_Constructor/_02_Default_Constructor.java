package _02_Constructor;

class Pen
{
    int price;
    String color;

    Pen()
    {
        System.out.println("you called");
    }

    public void prop()
    {
        System.out.println(price + " " + color);
    }
}

public class _02_Default_Constructor
{
    public static void main(String[] args) {
        /*
         default constructor ->
            default in the class when you create the object
            it always called when you create the  object
            when you do not pass any parameter inside the constructor it called default constructor
         */

        Pen p1 = new Pen();

        Pen p2 = new Pen();

    }
}
