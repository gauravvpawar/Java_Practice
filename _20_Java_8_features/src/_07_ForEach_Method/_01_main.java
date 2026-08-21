package _07_ForEach_Method;

import java.util.Arrays;
import java.util.List;

public class _01_main
{
    public static void main(String[] args) {
        // for each method is used to perform operation on each element of collection
        // foreach

        List<String> fruits = Arrays.asList("apple" ,"mango" , "banana" ,"papaya");
        // to print the all element

        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
