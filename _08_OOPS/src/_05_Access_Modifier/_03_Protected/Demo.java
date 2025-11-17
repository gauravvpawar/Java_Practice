package _05_Access_Modifier._03_Protected;

/*
    protected can accessible in class,outside class, child class also but it can accessible outside package child class
 */
public  class Demo{
    protected void fun()
    {
        System.out.println("Inside the fun");
    }

//    void test()
//    {
//        Human h2 = new Human();
//        h2.fun();
//    }

}

//public class Demo extends Human
//{
//    public static void main(String[] args) {
//        Human h1 = new Human();
//        h1.fun();
//        h1.test();
//    }
//}
