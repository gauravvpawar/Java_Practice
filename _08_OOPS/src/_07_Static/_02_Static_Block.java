package _07_Static;

class  Earth
{
    static {
        System.out.println("Inside the first static block");
    }

    static {
        System.out.println("Inside the second static block");
    }
}

public class _02_Static_Block
{
    static {
        System.out.println("Inside the first static block");
    }

    static {
        System.out.println("Inside the second static block");
    }


    public static void main(String[] args) {
        // when you want to execute static block inside the class you have to create object
        System.out.println("--------------------------");
        new Earth();
    }

    /* output
    Inside the first static block
    Inside the second static block
    --------------------------
    Inside the first static block
    Inside the second static block
     */
}
