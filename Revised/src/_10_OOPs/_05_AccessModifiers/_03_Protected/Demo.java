package _10_OOPs._05_AccessModifiers._03_Protected;

// protected access modifier
// the method ,variable or class it can be accessible within whole package and outside package child class



public class Demo
{
    public static void main(String[] args) {
        Human h = new Human();
        h.bankInfo(); // it can outside class
    }
}
