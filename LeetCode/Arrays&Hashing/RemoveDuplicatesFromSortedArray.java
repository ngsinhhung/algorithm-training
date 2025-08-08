
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[k] != nums[i]){
                k++;
                int temp  = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        // System.out.println(r.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(r.removeDuplicates(new int[]{1,1,2}));
    }
}
