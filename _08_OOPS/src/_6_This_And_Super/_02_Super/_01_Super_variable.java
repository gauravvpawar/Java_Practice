package _6_This_And_Super._02_Super;

/*
Super is always perform in the inheritance to allow the parent values
 */

class a
{
    int count = 25;
    void show()
    {
        System.out.println(count);
    }
}

class b extends a
{
    int count = 100;

    void show()
    {
        System.out.println(count);  // it show current instance value
        System.out.println(super.count);
    }
}


public class _01_Super_variable
{
    public static void main(String[] args) {
        b ex = new b();
        ex.show();
    }
}
