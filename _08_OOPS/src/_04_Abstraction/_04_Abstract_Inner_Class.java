package _04_Abstraction;

// if the class have the abstract and non abstract method we can define the body in
abstract class Animal
{
    abstract void sound();

    void run()
    {
        System.out.println("animal can run");
    }
}
public class _04_Abstract_Inner_Class {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("bark");
            }
        };

        dog.run();
        dog.sound();

    }
}
