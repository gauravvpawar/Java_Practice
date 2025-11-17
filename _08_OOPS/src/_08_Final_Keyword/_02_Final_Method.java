package _08_Final_Keyword;


class A{
    final void show()
    {
        System.out.println("Inside show");
    }

    void fun()
    {
        System.out.println("Inside fun");
    }
}

class B extends A
{
    // you cant
//    void show()
//    {
//        System.out.println("Here you call show inside B");
//    }

    void fun()
    {
        System.out.println("here you call fun function inside B");
    }
}

public class _02_Final_Method
{
    public static void main(String[] args) {
        /*
        final method is used for when the child class can not define the method again
         */

        A obj1 = new A();
        obj1.show();
        obj1.fun();

        B obj2 = new B();
        obj2.fun();
    }
}
