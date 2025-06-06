public class _01_Datatype
{
    public static void main(String[] args) {
        // find the char , byte , short
        byte a = 10;
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short b = 20;
        System.out.println(Short.BYTES);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // for the char declare size 2
        char c = '₹';
        System.out.println(c);
        System.out.println(Character.BYTES);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        //find the integer size
        int num = 40;
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //for the boolean declare
        boolean check = true;
        System.out.println(true);

        float avg  = 1.2f;
        System.out.println(avg);
        System.out.println(Float.BYTES);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);

        long d = 123456667890L; // no matter it is L or l
        System.out.println(d);
        System.out.println(Long.BYTES);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // double byte size is 8
        double e = 234567890.09876543d;
        System.out.println(e);
        System.out.println(Double.BYTES);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
