package Questions;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description///

public class _21_Subtract_Product_And_Sum
{
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0)
        {
            int rem = n % 10;
            sum = sum + rem;
            product = product* rem;
            n /= 10;
        }

        return product - sum;
    }
}
