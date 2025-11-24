package _02_Date_and_Time_Java.Sql;

import java.sql.*;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        By using the Java . sql you can fetch only the date
        you cant assign a date
         */
        long millis = System.currentTimeMillis();
        Date d1 = new Date(millis);
        System.out.println(d1.toLocalDate());
        System.out.println(d1.getTime());
    }
}
