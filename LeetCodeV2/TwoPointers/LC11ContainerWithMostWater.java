package LeetCodeV2.TwoPointers;

public class LC11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;
        while(l < r){
            int length = r - l;
            int width = Math.min(height[l],  height[r]);

            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
            maxArea = Math.max(maxArea, length * width);
        }


        return maxArea;
    }

    public static void main(String[] args) {
        LC11ContainerWithMostWater lc11 = new LC11ContainerWithMostWater();
        System.out.println(lc11.maxArea(new int [] {1,1}));
        
    }

}
