package _10_OOPs._08_Static;

// static method is always belongs to a class
// static method we can call directly without creating object class

class Bank
{
    static int amount = 1000;
    static void rules()
    {
        System.out.println("Each bank rules is different");
    }
}

public class _03_Static_Method
{
    public static void main(String[] args) {
        Bank.rules(); // we can call directly
        System.out.println(Bank.amount); // variable we can also access
    }
}
