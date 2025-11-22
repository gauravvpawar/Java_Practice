package _01_List._04_Stack;

import java.util.Iterator;
import java.util.Stack;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Stack since from java 1.0 it is also legacy class
        - it is thread safe
        - it is synchronised class method i.e it is slower
        - it follow last in first out operation
         */

        Stack s1 = new Stack();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);

        s1.push(10);
        Iterator i1 = s1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
        s1.pop();

        System.out.println(s1);
    }
}
