public class _03_Type_casting
{
    public static void main(String[] args) {
        // implicit type casting
        byte a = 10;

        double b;
        b = a;
        System.out.println(a);
        System.out.println(b);


        // explicit type casting
        // user explicit assign the data type store
        int x = 10;
        byte y;
        y = (byte)x;
        System.out.println(x);
        System.out.println(y);

    }
}
