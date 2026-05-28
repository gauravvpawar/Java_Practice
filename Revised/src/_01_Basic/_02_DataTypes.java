package _01_Basic;

public class _02_DataTypes
{
    public static void main(String[] args) {
        // we have primitive data type as well as the non-primitive data type
        // in primitive data type the value you want to store is in single unit
        // fixed size
        // in primitive we have
        // byte - short - int - float - long - double
        // char and boolean

        System.out.println("Byte : ");
        // its max range -128 to 128
        System.out.println(Byte.BYTES);//1 byte
        // byte a  = 20;


        System.out.println("Short :");
        System.out.println(Short.BYTES);//2 byte
        short b = 40;

        System.out.println("int");
        System.out.println(Integer.BYTES);// 4 byte
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int value = 10000;

        System.out.println("float");
        System.out.println(Float.BYTES);//4 byte
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        float pie = 3.142f;

        System.out.println("Long");
        System.out.println(Long.BYTES);// 8 byte
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        // it store large number value
        long Phone_Number = 1122334455667788L;


        System.out.println("Double");
        System.out.println(Double.BYTES);// 8 byte
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        double decimal = 123456679.98765321d;

        System.out.println("Boolean");
        // in boolean we dont have byte it depend on the compiler

        System.out.println("char");
        System.out.println(Character.BYTES); // in java character have 2 byte it store all ASCII value
        // American Standard code
        System.out.println(Character.MAX_RADIX);

        // In Non-primitive we have String Array class object

    }
}
