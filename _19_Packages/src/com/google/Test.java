package com.google;

import com.yahoo.*; // this is allow you to use all classes of yahoo folder not every package
import com.yahoo.groups.*; //


public class Test
{
    public static void main(String[] args) {
         // package is allow to manage the code to create a code like a building block and separation of module
        Work w = new Work();
        System.out.println(w.marks); //  you can use the value of class but you have import the class

        Web w1 = new Web(); // for this you have to specifically import the package
        System.out.println(w1.name);
    }
}
