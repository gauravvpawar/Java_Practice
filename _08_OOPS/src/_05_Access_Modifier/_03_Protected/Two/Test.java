package _05_Access_Modifier._03_Protected.Two;

import _05_Access_Modifier._03_Protected.Demo;

public class Test  extends Demo
{
    // you cant access in outside package
//    public static void main(String[] args) {
//        Human h1 = new Human();
//        h1.fun();
//    }

    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.fun();
    }
}
