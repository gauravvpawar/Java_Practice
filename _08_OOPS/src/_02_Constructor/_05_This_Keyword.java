package _02_Constructor;

class Human{
    int number;
    String count;

    Human()
    {
        System.out.println("inside default constructor");
        this.info();
    }
    // when you take same name parameter it might confuse what should have to assign
    // that case this show -> it refer the current object
    Human(int number, String count)
    {
        this();
        this.number = number;
        this.count = count;
    }

    void info()
    {
        System.out.println("Number : " + number);
        System.out.println("Count : " + count);
    }
}

public class _05_This_Keyword
{
    public static void main(String[] args) {
        /*
            This key word is always reference the current object
            this keyword always used for the to access current class variable method and constructor
         */

        Human male = new Human(1 , "7Billion");
        male.info();

        Human female = new Human(2, "7Billion");
        female.info();
    }
}
