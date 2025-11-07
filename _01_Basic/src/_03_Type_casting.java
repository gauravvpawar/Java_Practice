public class _03_Type_casting
{
    public static void main(String[] args) {
        // implicit type casting
        byte a = 10;

        double b;
        b = a;
        System.out.println(a);
        System.out.println(b);


        //  it follows byte < short < int  < long < float < double
//        float m = 22.34f;
//        long n = m;
//        System.out.println(); it cant work because it follows rule


        // explicit type casting
        // user explicit assign the data type store
        int x = 10;
        byte y;
        y = (byte)x;
        System.out.println(x);
        System.out.println(y);

    }
}
