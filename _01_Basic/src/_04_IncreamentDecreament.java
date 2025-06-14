public class _04_IncreamentDecreament
{
    public static void main(String args[])
    {
        // use of increment and decrement
        // post increment
        int a = 10;
        int b = a++ ; //  first use the value then increment
        System.out.println(a); // 11
        System.out.println(b); // 10

        // pre-increment
        int c = 10;
        int d = ++c; // first increase value assign and then use
        System.out.println(c); // 11
        System.out.println(d);// 11

        // same working of pre-decrement as well as the post decrement
        //  pre-decrement -> --a
        // post decrement -> a--;
    }
}
