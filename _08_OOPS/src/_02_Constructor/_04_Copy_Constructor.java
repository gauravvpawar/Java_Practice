package _02_Constructor;

import java.net.BindException;

class Birds{
    String name;
    int  number_of_legs;
    String color;

    Birds()
    {
        System.out.println("inside birds");
    }


    Birds(Birds bird)
    {
        name = bird.name;
        number_of_legs = bird.number_of_legs;
        color = bird.color;
    }

    public void info()
    {
        System.out.println("Name : " + name);
        System.out.println("Number of legs : " + number_of_legs);
        System.out.println("Color : " + color);
    }
}

public class _04_Copy_Constructor
{
    public static void main(String[] args) {
        /*
            copy constructor ->
                copy constructor is used for to initialise object with another object value
                simple way -> to create the  clone of the object from another object value
                when you define the any constructor you have to handle default constructor is not mandatory
         */

        Birds swan = new Birds();

        swan.name = "swan";
        swan.color = "White";
        swan.number_of_legs = 2;
        swan.info();

        Birds hen = new Birds(swan);

        hen.info();
    }
}
