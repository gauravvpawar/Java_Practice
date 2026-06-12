package _10_OOPs._06_This_Keyword;

class Calc
{
    int a , b , c, d;

    void add(int x)
    {
        a = x;
    }

    void  add(int a , int b)
    {
        // in that this refers to the current class variable , method and constructor
        this.a = a;
        this.b = b;

        // print the addition of number
        System.out.println("Addition : " + (a + b ));
    }
}

public class Main
{
    public static void main(String[] args) {

    }
}
