package _05_Method_Reference;

import java.util.ArrayList;
import java.util.List;

public class _01_Main
{
    public static void main(String[] args) {
        // method reference is the shorter way of used lambda expression
        // syntax : ClassName::methodName

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.forEach(System.out::println); // by method reference we can direct print element

        List<String> students = new ArrayList<>();
        students.add("Pavan");
        students.add("nitin");
        students.add("ganesh");
        List<String> users =  students.stream()
                .map(String::toUpperCase) //we can direct call methods
                .toList();

        System.out.println(users);
    }
}
