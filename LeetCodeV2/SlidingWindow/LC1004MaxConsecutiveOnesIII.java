package LeetCodeV2.SlidingWindow;

public class LC1004MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int maxLength = 0;
        int numZero = 0;

        while(r < nums.length) {
            if(nums[r] == 0){
                numZero++;
            } 

            while(numZero > k){
                if(nums[l] == 0){
                    numZero--;
                }
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LC1004MaxConsecutiveOnesIII lc1004 = new LC1004MaxConsecutiveOnesIII();
        System.out.println(lc1004.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        
    }

}
