package _10_OOPs._05_AccessModifiers._03_Protected.Test;


import _10_OOPs._05_AccessModifiers._03_Protected.Human;

// child clas want to access the property of parent class
public class Child extends Human
{
    public static void main(String[] args) {
        //Human h = new Human(); // you can not access it

        Child c1 = new Child(); // only child class can be accessible

        c1.bankInfo();

    }
}
