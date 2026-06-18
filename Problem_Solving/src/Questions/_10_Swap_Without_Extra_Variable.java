package Questions;

public class _10_Swap_Without_Extra_Variable
{
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("Before swap : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a + b; //25
        b = a - b; //25 - 15 -> 10 assign
        a = a - b; //25 - 10 -> 15 assign

        System.out.println("After swap :");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
