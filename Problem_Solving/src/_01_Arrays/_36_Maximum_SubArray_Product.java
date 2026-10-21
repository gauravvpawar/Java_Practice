package _01_Arrays;

public class _36_Maximum_SubArray_Product
{
    public static void main(String[] args) {
        _36_Maximum_SubArray_Product obj1 = new _36_Maximum_SubArray_Product();
        int arr[] = {2,3,-2,4};
//        int arr[] = {-2,0,-1};
//        int arr[] = {-3 , -1 , -1};
        int ans = obj1.maxProduct(arr);
        System.out.println(ans);
    }

    public  int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        int currentProduct = 1;
        for (int i = 0;i<n;i++)
        {
            currentProduct = currentProduct  * nums[i];

            if(currentProduct > maxProduct)
            {
                maxProduct = currentProduct;
            }

        }
        return maxProduct;
    }
}
