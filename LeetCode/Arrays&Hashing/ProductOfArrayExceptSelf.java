
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] answer = new int[n];

    //     int prod = 1;
    //     for (int i = 0; i < nums.length; i++) {
    //         if(i != 0 ){
    //             prod = prod * nums[i-1];
    //         }
    //         int temp = 1;
    //         for (int j = nums.length - 1; j > i; j--) {
    //             temp = temp * nums[j];
    //         }
    //         answer[i] = temp * prod;
    //     }

    //     return answer;
    // }

    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i-1];   
        }

        right[right.length - 1] = 1;
        for(int i = right.length - 2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rs[i] = left[i] * right[i];
        }
        return rs;
    }


    public static void main(String[] args) {
        ProductOfArrayExceptSelf test = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(test.productExceptSelf(new int[]{-1,1,0,-3,3})));
    }

}
