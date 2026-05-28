package _01_Basic;

public class _03_TypeCasting
{
    public static void main(String[] args) {
        // type casting mean converting one data type into another data type
        // in type casting we have
        // 1 Implicit Type Casting - It can store smaller one data type into larger one

        byte score = 120;
        int check  = score;
        System.out.println(check);
        // larger one it can store smaller one

        // 2 Explicit Type Casting - It can store the Larger one data into smaller one we have to explicit define it
        float pie = 3.142f;
        int number = (int)(pie);
        System.out.println(number);

    }
}
