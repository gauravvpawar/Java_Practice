package _04_Function;

public class _05_CallByValue
{
    public static void main(String[] args) {
        // java only support the call by value
        int a = 10;
        System.out.println(a);

        change(a);// it just pass the copy of value
        System.out.println(a);
    }

    public static void change(int x)
    {
        x = 200;
    }
}
