package _04_Function;

public class _03_BlockScope
{
    public static void main(String[] args) {
        // in Block scope
        // you can not accessible variable outside the block the
        // int that the outer variable you can access inside the block but inside variable you cant access outside the block

        int a = 15;
        int b = 20;

        {
            System.out.println(a);
            System.out.println(b);

            int c = 30;
            System.out.println(c);
        }

//        System.out.println(c);
    }
}
