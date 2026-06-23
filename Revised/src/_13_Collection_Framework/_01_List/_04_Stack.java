package _13_Collection_Framework._01_List;

/*
Stack is also legacy  class
stack introduced in java 1.0
stack also inherit properties of vector
stack follows lifo operation means last in first out
stack is also synchronised
stack have some its own method it include pop, peek() , push()
 */

import java.util.Iterator;
import java.util.Stack;

public class _04_Stack
{
    public static void main(String[] args) {
    // stack also allow to store duplicate elements
//        stack is also thread safe it also slower tha arraylist
        Stack s1 = new Stack();
        s1.add(11);
        s1.add(22);
        s1.add(33);
        s1.add(44);
        s1.add(11);
        s1.add(null);

        System.out.println(s1);

        System.out.println("to print the all values from vector");
        Iterator i = s1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek()); // print the top element from stack
        s1.push(33);
        System.out.println(s1);
    }
}
