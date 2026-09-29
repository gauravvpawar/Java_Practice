import java.util.Scanner;

public class _07_Taking_Input
{
    public static void main(String[] args) {
        // to take input from the user
        Scanner sc = new Scanner(System.in);
        // from scanner class object through we can take input

        // for byte
        System.out.println("Enter byte");
        byte a = sc.nextByte();
        System.out.println(a);

        // int
        System.out.println("Enter short value");
        short b = sc.nextShort();
        System.out.println(b);

        // int
        System.out.println("Enter int value");
        int c = sc.nextInt();
        System.out.println(c);

        // floating value
        System.out.println("Enter floating value");
        float d = sc.nextFloat();
        System.out.println(d);

        // long
        System.out.println("Enter long value : ");
        long e = sc.nextLong();
        System.out.println(e);

        // double
        System.out.println("Enter double value : ");
        double f = sc.nextDouble();
        System.out.println(f);

        // to take single word
        System.out.println("Enter word");
        String word = sc.next();
        System.out.println(word);

        System.out.println("Enter phase : ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
    }
}
