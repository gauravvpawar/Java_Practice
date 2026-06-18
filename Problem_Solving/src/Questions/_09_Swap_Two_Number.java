package Questions;

// swap the number using third variable

public class _09_Swap_Two_Number
{
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
        System.out.println("Before swap : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
