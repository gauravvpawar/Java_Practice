package _01_Basic;

public class _05_IncrementAndDecrement
{
    public static void main(String[] args) {
        // in increment or decrement it is precise operation of +1 or -1

        int score = 10;
        System.out.println(score++); // post increment // 10 after 11
        System.out.println(score--);// post decrement // 11 after it become 10

        System.out.println(--score);//pre decrement // 10 become 9
        System.out.println(++score);//pre increment it become 10 also

        System.out.println(score);
    }
}
