package LeetCodeV2.SlidingWindow;

// Given a Array A = [7, 3, 3, 3, 2, 2 , 2, 2] 
// find the length at the longest subarray with same value in each position

public class SlidingWindowFirst {

    public int longestSubArray(int []nums){
        int  l = 0, r = 0;
        int rs = 0;

        while(r < nums.length){
            if(nums[l] == nums[r]){
                r++;
            } else {
                rs = Math.max(rs, r - l);
                l = r;
            }
        }

        return Math.max(rs, r - l);
    }



    public static void main(String[] args) {
        SlidingWindowFirst swf = new SlidingWindowFirst();
        System.out.println(swf.longestSubArray(new int [] {7,3,3,3,2,2,2,2}));
        System.out.println(swf.longestSubArray(new int [] {1, 1, 1, 2, 2}));
        System.out.println(swf.longestSubArray(new int [] {2, 2, 2, 1}));
        
    }

}
