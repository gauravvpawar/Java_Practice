package _04_Function;

public class _02_ScopeOfVariable
{
    public static void main(String[] args) {
        // scope of variable in function in that we have
        /*
            1 -> function scope
            2 -> block scope
            3 -> Loop scope
         */

        // function scope is accessible within the block
        // you can be not accessible outside the block

        int func = add(15,110);
        System.out.println(func);

        // when you're trying to access the varible outside the function you can not
//        System.out.println(ans);
    }

    public static int add(int a,  int b)
    {
        int ans =  a + b;
        return ans;
    }

}
