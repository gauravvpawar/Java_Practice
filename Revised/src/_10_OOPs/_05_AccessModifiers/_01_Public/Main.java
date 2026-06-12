package _10_OOPs._05_AccessModifiers._01_Public;

// public is access modifier
// which provide class can be accessible in anywhere
// within same class
// within same package
// child class
// outside package
// outside package child class also

public class Main
{
    public static void main(String[] args)
    {
        Kite k = new Kite();
        k.fly();// valid
    }
}
