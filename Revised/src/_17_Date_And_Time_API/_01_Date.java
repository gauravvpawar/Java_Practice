package _17_Date_And_Time_API;

import java.util.Date;

public class _01_Date
{
    public static void main(String[] args) {
        /*
        one we have only we can fetch through date class
        before java 8
         */

        Date date = new Date();
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
