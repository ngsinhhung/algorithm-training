package LeetCodeV2.TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class LC977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        List<Integer> rs = new ArrayList();

        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(nums[r] < 0){
                nums[r] = nums[r] * -1;
            }

            if(nums[l] < 0){
                nums[l] = nums[l] * -1;
            }

            if(nums[r] > nums[l]){
                rs.add((int) Math.pow(nums[r], 2));
                r--;
            } else {
                rs.add((int) Math.pow(nums[l], 2));
                l++;
            }
        }

        Collections.reverse(rs);
        return rs.stream().mapToInt(i -> Integer.valueOf(i)).toArray();
    }

    public static void main(String[] args) {
        LC977SquaresOfASortedArray lc977 = new LC977SquaresOfASortedArray();
        int [] rs = lc977.sortedSquares(new int[] {-4,-1,0,3,10});

        for(int i = 0 ; i < rs.length; i++){
            System.out.println(rs[i]);
        }
    }

}
