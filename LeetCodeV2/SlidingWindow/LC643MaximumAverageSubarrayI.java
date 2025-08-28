package LeetCodeV2.SlidingWindow;


// 1 <= n <= k 
public class LC643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double currentSum = 0;

        for(int i = 0; i < k; i++){
            currentSum += nums[i];
        }

        double maxAverage = currentSum / k;

        for(int i = k; i < nums.length; i++){
            currentSum += nums[i];
            currentSum -= nums[i - k];

            double avg = currentSum / k;
            maxAverage = Math.max(maxAverage, avg);
        }
        return maxAverage;
    }

    public static void main(String[] args) {
        LC643MaximumAverageSubarrayI lc643 = new LC643MaximumAverageSubarrayI();
        System.out.println(lc643.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        // System.out.println(lc643.findMaxAverage(new int[] {5}, 1));
        // System.out.println(lc643.findMaxAverage(new int[] {-1}, 1));
    }
}
