package _12_MultiThreading._02_Thread_Priorities;


/*
MIN_PRIORITY = 1
NORM_PRIORITY = 5
MAX_PRIORITY = 10
to get the value of thread
using setPriority
and getPriority
 */

import javax.xml.transform.Source;
import java.util.Scanner;



public class Main
{
    public static void main(String[] args) {
        System.out.println("Jvm priority");
        System.out.println("By default JVM is 5 priority");

        Thread mainThread = Thread.currentThread();
        System.out.println("Thread name + " + mainThread.getName());
        System.out.println("main thread : " + mainThread.getPriority());

        //---------------------- to fetch all priority
        System.out.println("thread max priority : " + Thread.MAX_PRIORITY); // 10
        System.out.println("Thread min priority : " + Thread.MIN_PRIORITY); // 1
        System.out.println("Thread norm priority"); // 5

    }
}
