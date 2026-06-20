package _13_Collection_Framework._01_List;

import java.util.Iterator;
import java.util.LinkedList;

public class _02_Linked_List
{
    public static void main(String[] args) {
        /*  it introduced jdk 1.2
        Linked List follow doubly linked list data structure
        -- means the first node it save the address of another node
        -- node value contain  prev-> value -> next
        -- linked list contain we can add duplicate values
        -- it maintain the insertion order of the element
        -- it allows multiple null values
        -- in linked list the insertion and deletion of element it makes simple through the node structure
        -- linked list we can not access through index
         */

        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add((20));
        ll.add((30));
        ll.add((40));
        ll.add(50);

        // -- linked list allow to store the duplicate element and multiple null values
        ll.add(null);
        ll.add(null);
        ll.add(20);

        System.out.println(ll);

        // to fetch all object from linked list we can use the list Iterator
        Iterator i = ll.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next()); //  it print the all value from list
        }
    }
}
