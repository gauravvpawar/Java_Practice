package _01_Enum._01_Enum_Define;

enum WEEK
{
    MON , TUE, WED , THU , FRI , SAT, SUN
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        enum is special type of variable to define constant
        you cant create object of enum
        in enum can have variable , method ,constructor
        by default variable  values is 1 for ordinal
        enum you can define in class also and outside class also
         */

        WEEK w1 = WEEK.MON;
        System.out.println(w1);

        WEEK w2 = WEEK.MON;
        System.out.println(w2.ordinal());


        WEEK w3[] = WEEK.values();

        for(WEEK obj : w3)
        {
            System.out.println(obj + " : " + obj.ordinal());
        }


    }
}
