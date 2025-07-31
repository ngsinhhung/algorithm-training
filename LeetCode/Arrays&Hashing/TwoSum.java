/***
 * This problem:
    we know for sure 2 elements add up to target but we don't know where they locate. we use HashMap to store index of value.
    Target minus value -> check diff of substraction as key that contains in Map ? if true: return a array contains (index of value and index of diff from maps)
    Time complexity: O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if(!maps.containsKey(key)){
                maps.put(nums[i], i);
            } else {
                return new int[] {i, maps.get(key)};
            }
            
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] rs = ts.twoSum(new int[]{2,7,11,15}, 9);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();

        
    }

}
